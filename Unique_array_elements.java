int [] arr = new int[5];
        int count = 0, count_1 = 0;
        for (int i = 0; i < arr.length ; i++)
            arr[i]= scanner.nextInt();
        for (int i = 0; i < arr.length ; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++)
                if (arr[i] == arr[j] && i!=j) count++;
            if (count == 0)
                count_1++;
        }
        int [] arr1 = new int[count_1];
        int k=0;
        for (int i = 0; i < arr.length ; i++) {
            count=0;
            for (int j = 0; j < arr.length ; j++) {
                if (arr[i]==arr[j] && i!=j){
                    count++;
                }
            }
            if (count==0){
                arr1[k]=arr[i];
                        k++;
            }
        }
        for (int i = 0; i <arr1.length ; i++) {
           System.out.print(arr1[i]+" ");
        }
