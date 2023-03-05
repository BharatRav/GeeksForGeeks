package POTD.Year_2023.March.Mar_05_23;

import java.util.ArrayList;

public class AvoidExplosion {
    ArrayList<String> avoidExlosion(int mix[][], int n, int danger[][], int m) {
        int[] ds = new int[n];
        for (int i = 0; i < n; i++) ds[i] = i;

        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = mix[i][0] - 1, y = mix[i][1] - 1;
            int fx = find(x, ds), fy = find(y, ds);
            boolean is_safe = true;
            for (int j = 0; j < m; j++) {
                int p = danger[j][0] - 1, q = danger[j][1] - 1;
                int fp = find(p, ds), fq = find(q, ds);
                if ((fx == fp && fy == fq) || (fx == fq && fy == fp)) {
                    is_safe = false;
                    break;
                }
            }
            res.add(is_safe ? "Yes" : "No");
            if (is_safe) ds[fx] = fy;
        }

        return res;
    }

    private int find(int x, int[] ds) {
        if (ds[x] != x)
            ds[x] = find(ds[x], ds);
        return ds[x];

    }
}
