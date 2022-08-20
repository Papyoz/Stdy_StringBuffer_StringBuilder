package Code;

public class Main {
    public static void main(String[] args){
        String str = "Alyo chumba!";
        System.out.printf("Ёмкость база: %d\n",str.length());

        StringBuffer strbuff = new StringBuffer(str);
        System.out.printf("Ёмкость: %d\n",strbuff.capacity());

        strbuff.ensureCapacity(32);//Минимальная емкость массива
        System.out.printf("Ёмкость: %d\n",strbuff.capacity());//Емкость массива
        System.out.printf("%s, это был нерабочий вариант, поэтому переводим в string: %s\n",strbuff,strbuff.toString());

        char taken1 = strbuff.charAt(3);// Узнает символ по индексу
        strbuff.setCharAt(3, 'a');//Вставляети символ в нужные индекс
        System.out.printf("Взяли %c, Осталось: %s\n",taken1,strbuff);

        strbuff.append(" I am ABOBA\n");//дописывает в конец
        System.out.print(strbuff + "\n");

        strbuff.insert(3,'s');//Вставляет на нужный индекс
        System.out.print(strbuff + "\n");

        strbuff.delete(0,6);//Удаляет символы с и  по...
        strbuff.setCharAt(0,'C');
        strbuff.deleteCharAt(3);//Удаляет нужные символ по индексу
        System.out.print(strbuff + " \nlenght: " + strbuff.capacity()+"\n");//Т.е. все символы просто сдвигаются на место удаленного

        strbuff.substring(1,4 );
        System.out.print(strbuff + "\n");

        strbuff.setLength(20);//Добавляет еще пробелы, чтоб получить нужную длину строки
        strbuff.replace(0,6,"SHIITT!");
        System.out.print(strbuff + "\n");

        strbuff.reverse();//Реверс
        System.out.print(strbuff);
    }
}
