class multiples{

    public void main() {
        int i = 0;
        int counter = 0;
        while (i <= 1000) {
            if (i % 3 == 0 || i % 5 == 0){
                counter += 1;
            }
            i++;
        }
        System.out.println(counter);

    }


}



