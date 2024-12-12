class VaultDoor7Decrypt {
    public static void main(String[] args) {
        int[] x = new int[8];
        String[] s = new String[8];
        x[0] = 1096770097;
        x[1] = 1952395366;
        x[2] = 1600270708;
        x[3] = 1601398833;
        x[4] = 1716808014;
        x[5] = 1734304867;
        x[6] = 942695730;
        x[7] = 942748212;
        for (int i = 0; i < 8; i++) {
            s[i] = String.format("%32s", Integer.toBinaryString(x[i])).replace(' ', '0');
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 4; j++) {
                int start = j * 8;
                int temp = Integer.parseInt(s[i].substring(start, start + 8), 2);
                System.out.print((char) temp);
            }
        }
    }
}