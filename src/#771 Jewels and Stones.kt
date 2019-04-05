fun numJewelsInStones(J: String, S: String): Int {
    var stons = 0;
    for (i in 0..(J.length - 1)) {
        for (j in 0..(S.length - 1)) {
            if (J[i] == S[j])
                stons++;
        }
    }
    return stons;
}