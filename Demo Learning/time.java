class time{
    public static void main(String[] args) {
                
        long startTime = System.currentTimeMillis();
         
                String example = "example";
                for (int i = 0; i < 10000; i++) {
                    example += " added";
                }
                System.out.println("String time: " + (System.currentTimeMillis() - startTime) + "ms");
         
                startTime = System.currentTimeMillis();
                StringBuffer example2 = new StringBuffer("example");
                for (int i = 0; i < 10000; i++) {
                    example2.append(" added");
                }
                System.out.println("StringBuffer time: " + (System.currentTimeMillis() - startTime) + "ms");
         
                startTime = System.currentTimeMillis();
                StringBuilder example3 = new StringBuilder("example");
                for (int i = 0; i < 10000; i++) {
                    example3.append(" added");
                }
            System.out.println("StringBuilder time: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}