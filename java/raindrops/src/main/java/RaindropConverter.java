class RaindropConverter {

    String convert(int number) {

        StringBuilder sb = new StringBuilder();
        int [] arrDivider = {3, 5, 7};

        for (int i = 0; i < arrDivider.length; i++) {
            if (number % arrDivider[i] == 0) {
                switch (arrDivider[i]) {
                    case 3:
                        sb.append("Pling");
                        break;
                    case 5:
                        sb.append("Plang");
                        break;
                    case 7:
                        sb.append("Plong");
                        break;
                }
            }
        }

        if (sb.length() == 0) {
            sb.append(number);
        }

        return  sb.toString();
    }
}
