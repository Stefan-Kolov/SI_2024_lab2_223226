# Стефан Колов, 223226
### Control Flow Graph
![Screenshot 2024-05-23 153834](https://github.com/Stefan-Kolov/SI_2024_lab2_223226/assets/137779689/f9c9906a-7074-44a9-a936-f73ecc0ac02a)
### Цикломатска комплексност
Цикломатската комплексност на дадениот код изнесува 10. Истата ја добив со броење на затворените региони.
### Every Branch критериум
За овој критериум потребни се минимум 3 тестови каде што се опфатени сите линии код. Со првиот тест тестираме што кога листата е празна, со вториот тест ја тестираме функционалноста и проверките на производите во листата со разни спецификации (празно име, празен баркод, со/без попуст), а пак со третиот тест ја тестираме функционалноста кога payment е помало од вкупната сума на прозиводите. Во прилог се дадени користените тестови:
1. allItems = null, payment = 1000
2. allItems = { Name=Vino, Barcode=0123, Price=500, Discount=20;
Name=Cokolado, Barcode=3456, Price=60, Discount=30;
Name=null, Barcode=null, Price=100, Discount=10;
Name=Sok, Barcode=a256, Price=35, Discount=5;
Name=Jogurt, Barcode=1555, Price=85, Discount=0 }, payment = 20000
3. allItems = { Name=Mleko, Barcode=6543, Price=55, Discount=5; Name=Jajca, Barcode=9854, Price=90, Discount=0 }, payment = 35

