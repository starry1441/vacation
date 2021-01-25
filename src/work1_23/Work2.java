package work1_23;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * 在一个小镇里，按从 1 到 N 标记了 N 个人。传言称，这些人中有一个是小镇上的秘密法官。
 * 如果小镇的法官真的存在，那么：
 * 小镇的法官不相信任何人。
 * 每个人（除了小镇法官外）都信任小镇的法官。
 * 只有一个人同时满足属性 1 和属性 2 。
 * 给定数组 trust，该数组由信任对 trust[i] = [a, b] 组成，表示标记为 a 的人信任标记为 b 的人。
 * 如果小镇存在秘密法官并且可以确定他的身份，请返回该法官的标记。否则，返回 -1。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-the-town-judge
 * User: starry
 * Date: 2021 -01 -23
 * Time: 10:27
 */
public class Work2 {

    public int findJudge(int N, int[][] trust) {
        int m = trust.length;   // 行数，即关系对的数量
        if (m == 0) {
            return N == 1 ? 1 : -1;
        }
        int n = 2;              // 列数固定为2
        // 存储关系对
        int[][] relation = new int[N + 1][N + 1];
        for (int i = 0; i < m; i++) {
            relation[trust[i][0]][trust[i][1]] = 1;
        }

        int judge = -1;     // 法官编号
        for(int i = 1; i <= N; i++) {   // 对每个人
            // 他给人投过票吗？
            int vote = 0;
            for (int j = 1; j <= N && vote == 0; j++) {
                vote += relation[i][j];
            }


            int ticket = 0;     // 获得票数
            if (vote > 0) {     // 投过，不是法官，你可以走了，我要看下一个
                continue;
            } else {            // 没投过，靓仔，我看你很有成为法官的潜质哦
                for (int k = 1; k <= N; k++) {      // 让我看看多少人给你投票
                    ticket += relation[k][i];
                }
            }
            // 除了你，所有人都给你投票了
            // 恭喜你靓仔，你就是整个镇上最靓的仔(×)，法官(√)，其他人不用看了
            if (ticket == N - 1) {
                judge = i;
                break;
            }
        }
        return judge;   // 送你出道
    }

    public static void main(String[] args) {
        Work2 a = new Work2();
        int[][] trust = {{1,3},{1,4},{2,3},{2,4},{4,3}};
        int result = a.findJudge(4,trust);
        System.out.println(result);

    }

}
