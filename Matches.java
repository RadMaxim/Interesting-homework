int a = scanner.nextInt();
long str1 = a;
long str10 = a;
long str100 = a;
int count_x = 0;
int count_u = 0;
int count_p = 0;
long count_hundred = 1;
long count_dozens = 1;
long count_unit = 1;
int count_y = 0;
int count_z = 0;
int count_v = 0;
int sch1 = 0;
int sch2 = 0;
int sch3 = 0;

while (a!=0){
    if (a>=10 && a<=99){
            str10 = str10*sch1+a;
            count_x++;
            sch1 = 100;}
    else if (a>=0 && a<=9){
        str1 = str1*sch2+a;
        count_u++;
        sch2 = 10; // 10
    }
     else if (a>=100 && a<=999){
        str100 = str100*sch3+a;
        count_p++;
        sch3 = 1000;
    }
    a = scanner.nextInt();
}
long out19;
long out2;
long out3;
int b = scanner.nextInt();
while (b!=0) {
    if (b >= 10 && b <= 99 ) {
        for (int i = 0; i < count_x; i++) {
           if (i==(count_x-1)) out19 = (str10 / count_hundred);
           else out19 = (str10/count_hundred) % 100;
            count_hundred = count_hundred * 100;
            if (b == out19) count_y++;
        }
        System.out.println("Sovpad:" + count_y);
    }
    if (b >= 0 && b <= 9 ) {
        for (int j = 0; j < count_u; j++) {
            if(j==(count_u-1)) out2 = (str1/count_unit);
            else out2 = (str1/count_unit) % 10;
            count_unit = count_unit * 10;
            if (b == out2) count_z++;
        }
        System.out.println("Sovpad:" + count_z);
    }
    if (b >= 100 && b <= 999 ) {
        for (int k = 0; k < count_p; k++) {
            if(k==(count_p-1)) out3 = (str100/count_dozens);
            else out3 = (str100/count_dozens) % 1000;
            count_dozens = count_dozens * 1000;
            if (b == out3) count_v++;}
         System.out.println("Sovpad:" + count_v);
    }
    b = scanner.nextInt();
}
