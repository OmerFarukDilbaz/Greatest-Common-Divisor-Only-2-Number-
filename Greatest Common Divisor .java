        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        
        System.out.println("Please enter the first number.");

        double n1 = input.nextInt();

        System.out.println("Please enter the second number.");
       
        double n2 = input2.nextDouble();


        int gcd = 1;

        int k = 2;

        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
            k++;
        }
            System.out.println(gcd);
