# Стефан Колов, 223226
### Control Flow Graph
![siLab2 drawio](https://github.com/Stefan-Kolov/SI_2024_lab2_223226/assets/137779689/d19f604f-96eb-4932-bd0e-728e80a70467)
### Цикломатска комплексност
Цикломатската комплексност на дадениот код изнесува 10. Истата ја добив со броење на затворените региони.
### Every Branch критериум
За овој критериум потребни се 5 тестови каде што се опфатени сите линии код. 
Со првиот тест тестираме што кога листата е празна, со вториот тест ја тестираме функционалноста со валидни производи, каде што еден производ од листата нема име и вкупната сума на производите е помала од уплатата.
Со третиот тест ја тестираме функционалноста со невалиден формат на баркодот. 
Со четвртиот тест ја тестираме функционалноста со валидни производи, односно кога вкупната сума на производите е поголема од уплатата. 
Со петиот тест ја тестираме функционалноста кога на производот баркодот е null.Во прилог се дадени користените тестови:
1. allItems = null, payment = 1000
2. allItems = { Name=Vino, Barcode=0123, Price=500, Discount=20;
Name=Cokolado, Barcode=3456, Price=60, Discount=30;
Name=Jogurt, Barcode=1555, Price=85, Discount=0;
null, Barcode=7543, Price=100, Discount=10}, payment = 20000
3. allItems = { Name=Sok, Barcode=a256, Price=35, Discount=5 }, payment = 500
4. allItems = { Name=Cokolado, Barcode=1555, Price=150, Discount=2;
Name=Zejtin, Barcode=1111, Price=80, Disocunt=2 }, payment = 100
5. allItems = { Name=Riba, null, Price=500, Discount=2 }, payment = 1500
### Multiple Condition критериум
За овој критериум потребни се 8 теста каде што ќе ги опфатиме сите можни комбинации за условот if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0').
Комбинациите се: (TTT,TTF,TFT,TFF,FTT,FTF,FFT,FFF). Тестовите кои се користени се:
1. allItems = { Name=Jagodi, Barcode=0123, Price=350, Discount=10 }, payment = 4000
2. allItems = { Name=Prasak za perenje, Barcode=1345, Price=500, Discount=5 }, payment = 3000
3. allItems = { Name=Brasno, Barcode=0555, Price=400, Discount=0 }, payment = 500
4. allItems = { Name=Igracka, Barcode=5541, Price=1500, Discount=0 }, payment = 2000
5. allItems = { Name=Leb, Barcode=0000, Price=35, Discount=2 }, payment = 100
6. allItems = { Name=Cips, Barcode=9423, Price=80, Discount=5 }, payment = 500
7. allItems = { Name=Resani, Barcode=0921, Price=55, Discount=0 }, payment = 100
8. allItems = { Name=Mastiki, Barcode=1295, Price=35, Discount=0 }, payment = 50
### Објаснување на unit тестовите
Unit тестовите се наоѓаат на локацијата src/test/java под име SILab2Test. Класата содржи две функции со нотација @Test. Едната функција е именувана EveryBranch и го тестира Every Branch критериумот
додека пак другата функција е именувана MultipleCondition и го тестира Multiple Condition критериумот. Во EveryBranch функцијата се наоѓаат 6 assert изрази каде што се тестира дали функцијата
враќа true,false или секој посебен вид на exception. Опфатени се сите можни сценарија на output. Во MultipleCondition функцијата има 8 assertTrue изрази каде што се опфатени сите можни комбинации за условот
if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0').
