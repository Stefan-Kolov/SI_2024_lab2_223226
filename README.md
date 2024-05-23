# Стефан Колов, 223226
### Control Flow Graph
![Screenshot 2024-05-23 153834](https://github.com/Stefan-Kolov/SI_2024_lab2_223226/assets/137779689/f9c9906a-7074-44a9-a936-f73ecc0ac02a)
### Цикломатска комплексност
Цикломатската комплексност на дадениот код изнесува 10. Истата ја добив со броење на затворените региони.
### Every Branch критериум
За овој критериум потребни се 6 тестови каде што се опфатени сите линии код. Со првиот тест тестираме што кога листата е празна, со вториот тест ја тестираме функционалноста и проверките на производите во листата со празно име и баркод, со третиот тест ја тестираме функционалноста кога баркодот e null. Во четвртиот тест ја тестираме функционалноста кога баркодот е во невалиден формат. Во петиот и шестиот тест се тестираат валидни прозводи, одностно во петиот тест се тестира кога сумата е помала од уплатата, а во шестиот се тестира кога сумата е поголема од уплатата. Во прилог се дадени користените тестови:
1. allItems = null, payment = 1000
2. allItems = { null,null,Price=100,Discount=10 }, payment = 1500
3. allItems = { Name=Riba,null,Price=500,Discount=2 }, payment = 1500
4. allItems = { Name=Sok, Barcode=a256, Price=35, Discount=5 }, payment = 500
5. allItems = { Name=Vino, Barcode=0123, Price=500, Discount=20;
Name=Cokolado, Barcode=3456, Price=60, Discount=30;
Name=Jogurt, Barcode=1555, Price=85, Discount=0 }, payment = 20000
6. allItems = { Name=Cokolado, Barcode=1555, Price=150, Discount=2; Name=Zejtin, Barcode=1111, Price=80, Discount=2 }, payment = 100

