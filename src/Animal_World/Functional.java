package Animal_World;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Functional {
    Scanner in = new Scanner(System.in);
    private int num, secNum;
    private final String pathArt = "src\\Animal_World\\Artiodactyls.txt";
    private final String pathBat = "src\\Animal_World\\Bats.txt";
    private final String pathCet = "src\\Animal_World\\Cetaceans.txt";
    private final String pathEch = "src\\Animal_World\\Echidna.txt";
    private final String pathIns = "src\\Animal_World\\Insectivores.txt";
    private final String pathMar = "src\\Animal_World\\Marsupialia.txt";
    private final String pathPlat = "src\\Animal_World\\Platypus.txt";
    private final String pathPred = "src\\Animal_World\\Predatory.txt";
    private final String pathPrim = "src\\Animal_World\\Primates.txt";
    private final String pathProb = "src\\Animal_World\\Proboscis.txt";
    private final String pathRod = "src\\Animal_World\\Rodent.txt";
    private final ArrayList<Mammals> lstMam = new ArrayList<Mammals>();
    private final ArrayList<Prototheria> lstProt = new ArrayList<Prototheria>();
    private final ArrayList<Trechnotheria> lstTrec = new ArrayList<Trechnotheria>();
    private final ArrayList<Artiodactyls> lstArt = new ArrayList<Artiodactyls>();
    private final ArrayList<Bats> lstBat = new ArrayList<Bats>();
    private final ArrayList<Cetaceans> lstCet = new ArrayList<Cetaceans>();
    private final ArrayList<Echidna> lstEch = new ArrayList<Echidna>();
    private final ArrayList<Insectivores> lstIns = new ArrayList<Insectivores>();
    private final ArrayList<Marsupialia> lstMar = new ArrayList<Marsupialia>();
    private final ArrayList<Platypus> lstPlat = new ArrayList<Platypus>();
    private final ArrayList<Predatory> lstPred = new ArrayList<Predatory>();
    private final ArrayList<Primates> lstPrim = new ArrayList<Primates>();
    private final ArrayList<Proboscis> lstProb = new ArrayList<Proboscis>();
    private final ArrayList<Rodent> lstRod = new ArrayList<Rodent>();
    private String first;
    private String second;
    private String third;
    private String fourth;
    private double firstDouble;
    private String temp;
    private double secondDouble;
    private double thirdDouble;
    private String fifth;
    private int firstInt;
    private double fourthDouble;
    private String sixties;
    private boolean firstBool;
    private String seventh;

    public void start() {
        try (FileReader fr = new FileReader(pathArt)) {
            Scanner sc = new Scanner(fr);
            while (sc.hasNext()) {
                first = sc.nextLine();
                second = sc.nextLine();
                third = sc.nextLine();
                fourth = sc.nextLine();
                firstDouble = sc.nextDouble();
                temp = sc.nextLine();
                secondDouble = sc.nextDouble();
                temp = sc.nextLine();
                thirdDouble = sc.nextDouble();
                temp = sc.nextLine();
                fifth = sc.nextLine();
                sixties = sc.nextLine();
                firstInt = sc.nextInt();
                temp = sc.nextLine();
                fourthDouble = sc.nextDouble();
                temp = sc.nextLine();

                Artiodactyls art = new Artiodactyls(first ,second, third, fourth, firstDouble, secondDouble, thirdDouble, fifth, sixties,firstInt, fourthDouble);
                lstArt.add(art);
                sc.nextLine();
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fr = new FileReader(pathBat)) {
            Scanner sc = new Scanner(fr);
            while (sc.hasNext()) {
                first = sc.nextLine();
                second = sc.nextLine();
                third = sc.nextLine();
                firstDouble = sc.nextDouble();
                temp = sc.nextLine();
                secondDouble = sc.nextDouble();
                temp = sc.nextLine();
                thirdDouble = sc.nextDouble();
                temp = sc.nextLine();
                fourth = sc.nextLine();
                fifth = sc.nextLine();
                sixties = sc.nextLine();
                fourthDouble = sc.nextDouble();
                temp = sc.nextLine();

                Bats bat = new Bats(first, second, third, firstDouble, secondDouble, thirdDouble, fourth, fifth, sixties, fourthDouble);
                lstBat.add(bat);
                sc.nextLine();
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fr = new FileReader(pathCet)) {
            Scanner sc = new Scanner(fr);
            while (sc.hasNext()) {
                first = sc.nextLine();
                second = sc.nextLine();
                firstDouble = sc.nextDouble();
                temp = sc.nextLine();
                secondDouble = sc.nextDouble();
                temp = sc.nextLine();
                thirdDouble = sc.nextDouble();
                temp = sc.nextLine();
                third = sc.nextLine();
                fourth = sc.nextLine();
                fifth = sc.nextLine();

                Cetaceans cet = new Cetaceans(first, second, firstDouble, secondDouble, thirdDouble, third, fourth, fifth);
                lstCet.add(cet);
                sc.nextLine();
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fr = new FileReader(pathEch)) {
            Scanner sc = new Scanner(fr);
            while (sc.hasNext()) {
                first = sc.nextLine();
                firstDouble = sc.nextDouble();
                temp = sc.nextLine();
                secondDouble = sc.nextDouble();
                temp = sc.nextLine();
                thirdDouble = sc.nextDouble();
                temp = sc.nextLine();
                second = sc.nextLine();
                fourthDouble = sc.nextDouble();
                temp = sc.nextLine();

                Echidna ech = new Echidna(first, firstDouble, secondDouble, thirdDouble, second, fourthDouble);
                lstEch.add(ech);
                sc.nextLine();
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fr = new FileReader(pathIns)) {
            Scanner sc = new Scanner(fr);
            while (sc.hasNext()) {
                first = sc.nextLine();
                second = sc.nextLine();
                third = sc.nextLine();
                fourth = sc.nextLine();
                firstDouble = sc.nextDouble();
                temp = sc.nextLine();
                secondDouble = sc.nextDouble();
                temp = sc.nextLine();
                thirdDouble = sc.nextDouble();
                temp = sc.nextLine();
                fifth = sc.nextLine();
                sixties = sc.nextLine();

                Insectivores ins = new Insectivores(first, second, third, fourth, firstDouble, secondDouble, thirdDouble, fifth, sixties);
                lstIns.add(ins);
                sc.nextLine();
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fr = new FileReader(pathMar)) {
            Scanner sc = new Scanner(fr);
            while (sc.hasNext()) {
                first = sc.nextLine();
                second = sc.nextLine();
                third = sc.nextLine();
                fourth = sc.nextLine();
                firstBool = sc.nextBoolean();
                temp = sc.nextLine();
                firstDouble = sc.nextDouble();
                temp = sc.nextLine();
                secondDouble = sc.nextDouble();
                temp = sc.nextLine();
                thirdDouble = sc.nextDouble();
                temp = sc.nextLine();
                fifth = sc.nextLine();
                sixties = sc.nextLine();
                seventh = sc.nextLine();


                Marsupialia mar = new Marsupialia(first, second, third, fourth, firstBool, firstDouble, secondDouble, thirdDouble, fifth, sixties, seventh);
                lstMar.add(mar);
                sc.nextLine();
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fr = new FileReader(pathPlat)) {
            Scanner sc = new Scanner(fr);
            while (sc.hasNext()) {
                first = sc.nextLine();
                firstDouble = sc.nextDouble();
                temp = sc.nextLine();
                secondDouble = sc.nextDouble();
                temp = sc.nextLine();
                thirdDouble = sc.nextDouble();
                temp = sc.nextLine();
                second = sc.nextLine();

                Platypus plat = new Platypus(first, firstDouble, secondDouble, thirdDouble, second);
                lstPlat.add(plat);
                sc.nextLine();
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fr = new FileReader(pathPred)) {
            Scanner sc = new Scanner(fr);
            while (sc.hasNext()) {
                first = sc.nextLine();
                second = sc.nextLine();
                third = sc.nextLine();
                fourth = sc.nextLine();
                firstDouble = sc.nextDouble();
                temp = sc.nextLine();
                secondDouble = sc.nextDouble();
                temp = sc.nextLine();
                thirdDouble = sc.nextDouble();
                temp = sc.nextLine();
                fifth = sc.nextLine();
                sixties = sc.nextLine();
                firstInt = sc.nextInt();
                temp = sc.nextLine();
                fourthDouble = sc.nextDouble();
                temp = sc.nextLine();

                Predatory pred = new Predatory(first, second, third, fourth, firstDouble, secondDouble, thirdDouble, fifth, sixties, firstInt, fourthDouble);
                lstPred.add(pred);
                sc.nextLine();
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileReader fr = new FileReader(pathPrim)) {
            Scanner sc = new Scanner(fr);
            while (sc.hasNext()) {
                first = sc.nextLine();
                second = sc.nextLine();
                third = sc.nextLine();
                firstBool = sc.nextBoolean();
                firstDouble = sc.nextDouble();
                temp = sc.nextLine();
                secondDouble = sc.nextDouble();
                temp = sc.nextLine();
                thirdDouble = sc.nextDouble();
                temp = sc.nextLine();
                fourth = sc.nextLine();
                fifth = sc.nextLine();

                Primates prim = new Primates(first ,second, third, firstBool, firstDouble, secondDouble, thirdDouble, fourth, fifth);
                lstPrim.add(prim);
                sc.nextLine();
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fr = new FileReader(pathProb)) {
            Scanner sc = new Scanner(fr);
            while (sc.hasNext()) {
                first = sc.nextLine();
                second = sc.nextLine();
                third = sc.nextLine();
                firstDouble = sc.nextDouble();
                temp = sc.nextLine();
                secondDouble = sc.nextDouble();
                temp = sc.nextLine();
                thirdDouble = sc.nextDouble();
                temp = sc.nextLine();
                fourth = sc.nextLine();
                fifth = sc.nextLine();
                sixties = sc.nextLine();
                fourthDouble = sc.nextDouble();
                temp = sc.nextLine();

                Proboscis prob = new Proboscis(first ,second, third, firstDouble, secondDouble, thirdDouble, fourth, fifth, sixties, fourthDouble);
                lstProb.add(prob);
                sc.nextLine();
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileReader fr = new FileReader(pathRod)) {
            Scanner sc = new Scanner(fr);
            while (sc.hasNext()) {
                first = sc.nextLine();
                second = sc.nextLine();
                third = sc.nextLine();
                firstDouble = sc.nextDouble();
                temp = sc.nextLine();
                secondDouble = sc.nextDouble();
                temp = sc.nextLine();
                thirdDouble = sc.nextDouble();
                temp = sc.nextLine();
                fourth = sc.nextLine();
                fifth = sc.nextLine();
                sixties = sc.nextLine();

                Rodent rod = new Rodent(first ,second, third, firstDouble, secondDouble, thirdDouble, fourth, fifth, sixties);
                lstRod.add(rod);
                sc.nextLine();
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Добавление всех отдельных списков Первозверей в один общий
        lstProt.addAll(lstPlat);
        lstProt.addAll(lstEch);
        //Добавление всех отдельных списков Живородящих в один общий
        lstTrec.addAll(lstArt);
        lstTrec.addAll(lstBat);
        lstTrec.addAll(lstCet);
        lstTrec.addAll(lstIns);
        lstTrec.addAll(lstMar);
        lstTrec.addAll(lstPred);
        lstTrec.addAll(lstPrim);
        lstTrec.addAll(lstRod);
        //Объединение всех млекопитающих в один список
        lstMam.addAll(lstProt);
        lstMam.addAll(lstTrec);

        startMenu();
        end();
    }

    public void startMenu() {
        while (true) {
            while (true) {
                System.out.println("""
                        Введите соответствующую цифру, чтобы:
                        1. Просмотреть список всех млекопитающих
                        2. Просмотреть список по определённой группе млекопитающих
                        3. Добавить животное в определённую группу млекопитающих
                        4. Удалить животное из определённой группы млекопитающих
                        5. Выйти из программы\s""");
                temp = in.nextLine();
                if (temp.equals("1") || temp.equals("2") || temp.equals("3") || temp.equals("4")) {
                    num = Integer.parseInt(temp);
                    break;
                }
                else if (temp.equals("5"))
                    return;
            }
            secNum = num;
            switch (num) {
                case 1:
                    for (Mammals mammals : lstMam) {
                        mammals.print();
                        System.out.println();
                    }
                    break;
                case 2, 3, 4:
                    mammalsMenu();
                    break;
            }
        }
    }
    public void mammalsMenu() {
        while (true) {
            while (true) {
                System.out.println("""
                        Группы млекопитаюющих:
                        1. Яйцекладущие
                        2. Виды яйцкладущих
                        3. Живородящие
                        4. Виды живородящих
                        5. Вернуться в прошлое меню\s""");
                temp = in.nextLine();
                if (temp.equals("1") || temp.equals("2") || temp.equals("3") || temp.equals("4")) {
                    num = Integer.parseInt(temp);
                    break;
                }
                else if (temp.equals("5"))
                    return;
            }
            firstFuncMenu(num);
        }
    }
    public void protoMenu() {
        while (true) {
            while (true) {
                System.out.println("""
                        Виды яйцекладущих:
                        1. Ехидны
                        2. Утконосы
                        3. Вернуться в прошлое меню\s""");
                temp = in.nextLine();
                if (temp.equals("1") || temp.equals("2")) {
                    num = Integer.parseInt(temp);
                    break;
                }
                else if (temp.equals("3"))
                    return;
            }
            switch (num) {
                case 1:
                    echMenu();
                    break;
                case 2:
                    platMenu();
                    break;
            }
        }
    }
    public void trecMenu() {
        while (true) {
            System.out.println("""
                Отряды живородящих:
                1. Парнокопытные
                2. Рукокрылые
                3. Китообразные
                4. Насекомоядные
                5. Сумчатые
                6. Хищные
                7. Приматы
                8. Хоботные
                9. Грызуны
                10. Вернуться в прошлое меню\s""");
            temp = in.nextLine();
            if (temp.equals("1") || temp.equals("2") || temp.equals("3") || temp.equals("4") || temp.equals("5") || temp.equals("6") || temp.equals("7") || temp.equals("8") || temp.equals("9")) {
                num = Integer.parseInt(temp);
                break;
            }
            else if (temp.equals("10"))
                return;
        }
        switch (num) {
            case 1:
                artMenu();
                break;
            case 2:
                batMenu();
                break;
            case 3:
                cetMenu();
                break;
            case 4:
                insMenu();
                break;
            case 5:
                marMenu();
                break;
            case 6:
                predMenu();
                break;
            case 7:
                primMenu();
                break;
            case 8:
                probMenu();
                break;
            case 9:
                rodMenu();
                break;
        }
    }
    public void firstFuncMenu(int num) {
        switch (secNum) {
            case 2:
                switch (num) {
                    case 1:
                        for (Prototheria prototheria : lstProt) {
                            prototheria.print();
                            System.out.println();
                        }
                        return;
                    case 2:
                        protoMenu();
                        break;
                    case 3:
                        for (Trechnotheria trechnotheria : lstTrec) {
                            trechnotheria.print();
                            System.out.println();
                        }
                        break;
                    case 4:
                        trecMenu();
                        break;
                }
                break;
            case 3, 4:
                switch (num) {
                    case 1, 2:
                        protoMenu();
                        break;
                    case 3, 4:
                        trecMenu();
                        break;
                }
                break;
        }
    }
    public void echMenu() {
        switch (secNum) {
            case 2:
                for (Echidna echidna : lstEch) {
                    echidna.print();
                    System.out.println();
                }
                break;
            case 3:
                System.out.print("Введите имя ехидны ");
                first = in.nextLine();
                System.out.print("Введите длину хвоста ехидны ");
                firstDouble = in.nextDouble();
                System.out.print("Введите длину тела ехидны ");
                secondDouble = in.nextDouble();
                System.out.print("Введите вес ехидны ");
                thirdDouble = in.nextDouble();
                temp = in.nextLine();
                System.out.print("Введите звуки, которые издаёт ваша ехидна ");
                second = in.nextLine();
                System.out.print("Введите длину иголок ехидны ");
                fourthDouble = in.nextDouble();

                Echidna ech = new Echidna(first, firstDouble, secondDouble, thirdDouble, second, fourthDouble);
                lstEch.add(ech);
                break;
            case 4:
                int j;
                for (int i = 0; i < lstEch.size(); i++) {
                    j = i + 1;
                    System.out.print(j + ". ");
                    lstEch.get(i).print();
                    System.out.println();
                }
                System.out.print("Введите номер ехидны, которую хотите удалить ");
                j = in.nextInt();
                lstEch.remove(--j);
                break;
        }
    }
    public void platMenu() {
        switch (secNum) {
            case 2:
                for (Platypus platypus : lstPlat) {
                    platypus.print();
                    System.out.println();
                }
                break;
            case 3:
                System.out.print("Введите имя утконоса ");
                first = in.nextLine();
                System.out.print("Введите длину хвоста утконоса ");
                firstDouble = in.nextDouble();
                System.out.print("Введите длину тела утконоса ");
                secondDouble = in.nextDouble();
                System.out.print("Введите вес утконоса ");
                thirdDouble = in.nextDouble();
                temp = in.nextLine();
                System.out.print("Введите звуки, которые издаёт ваш утконос ");
                second = in.nextLine();

                Platypus plat = new Platypus(first, firstDouble, secondDouble, thirdDouble, second);
                lstPlat.add(plat);
                break;
            case 4:
                int j;
                for (int i = 0; i < lstPlat.size(); i++) {
                    j = i + 1;
                    System.out.print(j + ". ");
                    lstPlat.get(i).print();
                    System.out.println();
                }
                System.out.print("Введите номер утконоса, которого хотите удалить ");
                j = in.nextInt();
                lstPlat.remove(--j);
        }
    }
    public void artMenu() {
        switch (secNum) {
            case 2:
                for (Artiodactyls artiodactyls : lstArt) {
                    artiodactyls.print();
                    System.out.println();
                }
                break;
            case 3:
                System.out.print("Введите имя парнокопытного ");
                first = in.nextLine();
                System.out.print("Введите вид парнокопытного ");
                second = in.nextLine();
                System.out.print("Введите цвет покрытия парнокопытного ");
                third = in.nextLine();
                System.out.print("Введите тип покрытия парнокопытного ");
                fourth = in.nextLine();
                System.out.print("Введите длину хвоста парнокопытного ");
                firstDouble = in.nextDouble();
                System.out.print("Введите длину тела парнокопытного ");
                secondDouble = in.nextDouble();
                System.out.print("Введите вес парнокопытного ");
                thirdDouble = in.nextDouble();
                temp = in.nextLine();
                System.out.print("Введите ареал обитания парнокопытного ");
                fifth = in.nextLine();
                System.out.print("Введите звук, который издаёт парнокопытное ");
                sixties = in.nextLine();
                System.out.print("Введите количество рогов парнокопытного ");
                firstInt = in.nextInt();
                if (firstInt == 0)
                    fourthDouble = 0;
                else {
                    System.out.print("Введите длину рога(ов) парнокопытного ");
                    fourthDouble = in.nextDouble();
                }
                temp = in.nextLine();

                Artiodactyls art = new Artiodactyls(first, second, third, fourth, firstDouble, secondDouble, thirdDouble, fifth, sixties, firstInt, fourthDouble);
                lstArt.add(art);
                break;
            case 4:
                int j;
                for (int i = 0; i < lstArt.size(); i++) {
                    j = i + 1;
                    System.out.print(j + ". ");
                    lstArt.get(i).print();
                    System.out.println();
                }
                System.out.print("Введите номер парнокопытного, которого хотите удалить ");
                j = in.nextInt();
                lstArt.remove(--j);
                break;
        }
    }
    public void batMenu() {
        switch (secNum) {
            case 2:
                for (Bats bats : lstBat) {
                    bats.print();
                    System.out.println();
                }
                break;
            case 3:
                System.out.print("Введите имя рукокрылого ");
                first = in.nextLine();
                System.out.print("Введите вид рукокрылого ");
                second = in.nextLine();
                System.out.print("Введите цвет шерсти рукокрылого ");
                third = in.nextLine();
                System.out.print("Введите длину хвоста рукокрылого ");
                firstDouble = in.nextDouble();
                System.out.print("Введите длину тела рукокрылого ");
                secondDouble = in.nextDouble();
                System.out.print("Введите вес рукокрылого ");
                thirdDouble = in.nextDouble();
                temp = in.nextLine();
                System.out.print("Введите, чем питается рукокрылый ");
                fourth = in.nextLine();
                System.out.print("Введите ареал обитания рукокрылого ");
                fifth = in.nextLine();
                System.out.print("Введите звук, который издаёт рукокрылый ");
                sixties = in.nextLine();
                System.out.print("Введите размах крыльев рукокрылого ");
                fourthDouble = in.nextDouble();
                temp = in.nextLine();

                Bats bat = new Bats(first, second, third, firstDouble, secondDouble, thirdDouble, fourth, fifth, sixties, fourthDouble);
                lstBat.add(bat);
                break;
            case 4:
                int j;
                for (int i = 0; i < lstBat.size(); i++) {
                    j = i + 1;
                    System.out.print(j + ". ");
                    lstBat.get(i).print();
                    System.out.println();
                }
                System.out.print("Введите номер рукокрылого, которого хотите удалить ");
                j = in.nextInt();
                lstBat.remove(--j);
                break;
        }
    }
    public void cetMenu() {
        switch (secNum) {
            case 2:
                for (Cetaceans cetaceans : lstCet) {
                    cetaceans.print();
                    System.out.println();
                }
                break;
            case 3:
                System.out.print("Введите имя китового ");
                first = in.nextLine();
                System.out.print("Введите вид китового ");
                second = in.nextLine();
                System.out.print("Введите длину хвоста китового ");
                firstDouble = in.nextDouble();
                System.out.print("Введите длину тела китового ");
                secondDouble = in.nextDouble();
                System.out.print("Введите вес китового ");
                thirdDouble = in.nextDouble();
                temp = in.nextLine();
                System.out.print("Введите, чем питается китовый ");
                third = in.nextLine();
                System.out.print("Введите звук, который издаёт китовый ");
                fourth = in.nextLine();
                System.out.print("Введите цвет кожи кивового ");
                fifth = in.nextLine();

                Cetaceans cet = new Cetaceans(first, second, firstDouble, secondDouble, thirdDouble, third, fourth, fifth);
                lstCet.add(cet);
                break;
            case 4:
                int j;
                for (int i = 0; i < lstCet.size(); i++) {
                    j = i + 1;
                    System.out.print(j + ". ");
                    lstCet.get(i).print();
                    System.out.println();
                }
                System.out.print("Введите номер китового, которого хотите удалить ");
                j = in.nextInt();
                lstBat.remove(--j);
                break;
        }
    }
    public void insMenu() {
        switch (secNum) {
            case 2:
                for (Insectivores insectivores : lstIns) {
                    insectivores.print();
                    System.out.println();
                }
                break;
            case 3:
                System.out.print("Введите имя насекомоядного ");
                first = in.nextLine();
                System.out.print("Введите вид насекомоядного ");
                second = in.nextLine();
                System.out.print("Введите цвет покрытия насекомоядного ");
                third = in.nextLine();
                System.out.print("Введите тип покрытия насекомоядного ");
                fourth = in.nextLine();
                System.out.print("Введите длину хвоста насекомоядного ");
                firstDouble = in.nextDouble();
                System.out.print("Введите длину тела насекомоядного ");
                secondDouble = in.nextDouble();
                System.out.print("Введите вес насекомоядного ");
                thirdDouble = in.nextDouble();
                temp = in.nextLine();
                System.out.print("Введите ареал обитания насекомоядного ");
                fifth = in.nextLine();
                System.out.print("Введите звук, который издаёт насекомоядное ");
                sixties = in.nextLine();

                Insectivores ins = new Insectivores(first, second, third, fourth, firstDouble, secondDouble, thirdDouble, fifth, sixties);
                lstIns.add(ins);
                break;
            case 4:
                int j;
                for (int i = 0; i < lstIns.size(); i++) {
                    j = i + 1;
                    System.out.print(j + ". ");
                    lstIns.get(i).print();
                    System.out.println();
                }
                System.out.print("Введите номер насекомоядного, которого хотите удалить ");
                j = in.nextInt();
                lstIns.remove(--j);
                break;
        }
    }
    public void marMenu() {
        switch (secNum) {
            case 2:
                for (Marsupialia marsupialia : lstMar) {
                    marsupialia.print();
                    System.out.println();
                }
                break;
            case 3:
                System.out.print("Введите имя сумчатого ");
                first = in.nextLine();
                System.out.print("Введите вид сумчатого ");
                second = in.nextLine();
                System.out.print("Введите цвет покрытия сумчатого ");
                third = in.nextLine();
                System.out.print("Введите тип покрытия сумчатого ");
                fourth = in.nextLine();
                System.out.print("Есть ли хвост у этого сумчатого? ");
                firstBool = in.nextBoolean();
                if (firstBool) {
                    System.out.print("Введите длину хвоста сумчатого ");
                    firstDouble = in.nextDouble();
                }
                else
                    firstDouble = 0;
                System.out.print("Введите длину тела сумчатого ");
                secondDouble = in.nextDouble();
                System.out.print("Введите вес сумчатого ");
                thirdDouble = in.nextDouble();
                temp = in.nextLine();
                System.out.println("Введите то, чем питается сумчатое ");
                fifth = in.nextLine();
                System.out.print("Введите ареал обитания сумчатого ");
                sixties = in.nextLine();
                System.out.print("Введите звук, который издаёт сумчатое ");
                seventh = in.nextLine();

                Marsupialia mar = new Marsupialia(first, second, third, fourth, firstBool, firstDouble, secondDouble, thirdDouble, fifth, sixties, seventh);
                lstMar.add(mar);
                break;
            case 4:
                int j;
                for (int i = 0; i < lstMar.size(); i++) {
                    j = i + 1;
                    System.out.print(j + ". ");
                    lstMar.get(i).print();
                    System.out.println();
                }
                System.out.print("Введите номер сумчатое, которого хотите удалить ");
                j = in.nextInt();
                lstMar.remove(--j);
                break;
        }
    }
    public void predMenu() {
        switch (secNum) {
            case 2:
                for (Predatory predatory : lstPred) {
                    predatory.print();
                    System.out.println();
                }
                break;
            case 3:
                System.out.print("Введите имя хищника ");
                first = in.nextLine();
                System.out.print("Введите вид хищника ");
                second = in.nextLine();
                System.out.print("Введите цвет покрытия хищника ");
                third = in.nextLine();
                System.out.print("Введите тип покрытия хищника ");
                fourth = in.nextLine();
                System.out.print("Введите длину хвоста хищника ");
                firstDouble = in.nextDouble();
                System.out.print("Введите длину тела хищника ");
                secondDouble = in.nextDouble();
                System.out.print("Введите вес хищника ");
                thirdDouble = in.nextDouble();
                temp = in.nextLine();
                System.out.print("Введите ареал обитания хищника ");
                fifth = in.nextLine();
                System.out.print("Введите звук, который издаёт хищник ");
                sixties = in.nextLine();
                System.out.print("Введите количество клыков хищника ");
                firstInt = in.nextInt();
                System.out.print("Введите длину клыков хищника ");
                fourthDouble = in.nextDouble();
                temp = in.nextLine();

                Predatory pred = new Predatory(first, second, third, fourth, firstDouble, secondDouble, thirdDouble, fifth, sixties, firstInt, fourthDouble);
                lstPred.add(pred);
                break;
            case 4:
                int j;
                for (int i = 0; i < lstPred.size(); i++) {
                    j = i + 1;
                    System.out.print(j + ". ");
                    lstPred.get(i).print();
                    System.out.println();
                }
                System.out.print("Введите номер хищника, которого хотите удалить ");
                j = in.nextInt();
                lstPred.remove(--j);
                break;
        }
    }
    public void primMenu() {
        switch (secNum) {
            case 2:
                for (Primates primates : lstPrim) {
                    primates.print();
                    System.out.println();
                }
                break;
            case 3:
                System.out.print("Введите имя примата ");
                first = in.nextLine();
                System.out.print("Введите вид примата ");
                second = in.nextLine();
                System.out.print("Введите цвет шерсти примата ");
                third = in.nextLine();
                System.out.print("Есть ли хвост у этого примата? ");
                firstBool = in.nextBoolean();
                if (firstBool) {
                    System.out.print("Введите длину хвоста примата ");
                    firstDouble = in.nextDouble();
                }
                else
                    firstDouble = 0;
                System.out.print("Введите длину тела примата ");
                secondDouble = in.nextDouble();
                System.out.print("Введите вес примата ");
                thirdDouble = in.nextDouble();
                temp = in.nextLine();
                System.out.print("Введите ареал обитания примата ");
                fourth = in.nextLine();
                System.out.print("Введите звук, который издаёт примат ");
                fifth = in.nextLine();

                Primates prim = new Primates(first, second, third, firstBool, firstDouble, secondDouble, thirdDouble, fourth, fifth);
                lstPrim.add(prim);
                break;
            case 4:
                int j;
                for (int i = 0; i < lstPrim.size(); i++) {
                    j = i + 1;
                    System.out.print(j + ". ");
                    lstPrim.get(i).print();
                    System.out.println();
                }
                System.out.print("Введите номер примата, которого хотите удалить ");
                j = in.nextInt();
                lstPrim.remove(--j);
                break;
        }
    }
    public void probMenu() {
        switch (secNum) {
            case 2:
                for (Proboscis proboscis : lstProb) {
                    proboscis.print();
                    System.out.println();
                }
                break;
            case 3:
                System.out.print("Введите имя хоботового ");
                first = in.nextLine();
                System.out.print("Введите вид хоботового ");
                second = in.nextLine();
                System.out.print("Введите цвет шерсти хоботового ");
                third = in.nextLine();
                System.out.print("Введите длину хвоста хоботового ");
                firstDouble = in.nextDouble();
                System.out.print("Введите длину тела хоботового ");
                secondDouble = in.nextDouble();
                System.out.print("Введите вес хоботового ");
                thirdDouble = in.nextDouble();
                temp = in.nextLine();
                System.out.print("Введите то, чем питается данный хоботовый ");
                fourth = in.nextLine();
                System.out.print("Введите ареал обитания хоботового ");
                fifth = in.nextLine();
                System.out.print("Введите звук, который издаёт хоботовый ");
                sixties = in.nextLine();
                System.out.print("Введите длину хобота хоботового ");
                fourthDouble = in.nextDouble();

                Proboscis prob = new Proboscis(first, second, third, firstDouble, secondDouble, thirdDouble, fourth, fifth, sixties, fourthDouble);
                lstProb.add(prob);
                break;
            case 4:
                int j;
                for (int i = 0; i < lstProb.size(); i++) {
                    j = i + 1;
                    System.out.print(j + ". ");
                    lstProb.get(i).print();
                    System.out.println();
                }
                System.out.print("Введите номер хоботового, которого хотите удалить ");
                j = in.nextInt();
                lstProb.remove(--j);
                break;
        }
    }
    public void rodMenu() {
        switch (secNum) {
            case 2:
                for (Rodent rodent : lstRod) {
                    rodent.print();
                    System.out.println();
                }
                break;
            case 3:
                System.out.print("Введите имя грызуна ");
                first = in.nextLine();
                System.out.print("Введите вид грызуна ");
                second = in.nextLine();
                System.out.print("Введите цвет шерсти грызуна ");
                third = in.nextLine();
                System.out.print("Введите длину хвоста грызуна ");
                firstDouble = in.nextDouble();
                System.out.print("Введите длину тела грызуна ");
                secondDouble = in.nextDouble();
                System.out.print("Введите вес грызуна ");
                thirdDouble = in.nextDouble();
                temp = in.nextLine();
                System.out.print("Введите то, чем питается данный грызун ");
                fourth = in.nextLine();
                System.out.print("Введите ареал обитания грызуна ");
                fifth = in.nextLine();
                System.out.print("Введите звук, который издаёт грызун ");
                sixties = in.nextLine();

                Rodent rod = new Rodent(first, second, third, firstDouble, secondDouble, thirdDouble, fourth, fifth, sixties);
                lstRod.add(rod);
                break;
            case 4:
                int j;
                for (int i = 0; i < lstRod.size(); i++) {
                    j = i + 1;
                    System.out.print(j + ". ");
                    lstRod.get(i).print();
                    System.out.println();
                }
                System.out.print("Введите номер грызуна, которого хотите удалить ");
                j = in.nextInt();
                lstRod.remove(--j);
                break;
        }
    }

    public void end() {
        try (FileWriter fw = new FileWriter(pathArt, false)) {
            for (Artiodactyls arts : lstArt) {
                fw.write(arts.getName() + "\n");
                fw.write(arts.getKind() + "\n");
                fw.write(arts.getCoatColor() + "\n");
                fw.write(arts.getTypeOfCoat() + "\n");
                fw.write(arts.getTailLength() + "\n");
                fw.write(arts.getBodyLength() + "\n");
                fw.write(arts.getWeight() + "\n");
                fw.write(arts.getHabitat() + "\n");
                fw.write(arts.getSound() + "\n");
                fw.write(arts.getAmountOfHornes() + "\n");
                fw.write(arts.getHorneLength() + "\n---\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter fw = new FileWriter(pathBat, false)) {
            for (Bats bats : lstBat) {
                fw.write(bats.getName() + "\n");
                fw.write(bats.getKind() + "\n");
                fw.write(bats.getCoatColor() + "\n");
                fw.write(bats.getTailLength() + "\n");
                fw.write(bats.getBodyLength() + "\n");
                fw.write(bats.getWeight() + "\n");
                fw.write(bats.getTypeOfFood() + "\n");
                fw.write(bats.getHabitat() + "\n");
                fw.write(bats.getSound() + "\n");
                fw.write(bats.getWingspan() + "\n---\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter fw = new FileWriter(pathCet, false)) {
            for (Cetaceans cets : lstCet) {
                fw.write(cets.getName() + "\n");
                fw.write(cets.getKind() + "\n");
                fw.write(cets.getTailLength() + "\n");
                fw.write(cets.getBodyLength() + "\n");
                fw.write(cets.getWeight() + "\n");
                fw.write(cets.getTypeOfFood() + "\n");
                fw.write(cets.getSound() + "\n");
                fw.write(cets.getSkinColor() + "\n---\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter fw = new FileWriter(pathEch, false)) {
            for (Echidna ech : lstEch) {
                fw.write(ech.getName() + "\n");
                fw.write(ech.getTailLength() + "\n");
                fw.write(ech.getBodyLength() + "\n");
                fw.write(ech.getWeight() + "\n");
                fw.write(ech.getSound() + "\n");
                fw.write(ech.getLengthOfNeedles() + "\n---\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter fw = new FileWriter(pathIns, false)) {
            for (Insectivores ins : lstIns) {
                fw.write(ins.getName() + "\n");
                fw.write(ins.getKind() + "\n");
                fw.write(ins.getCoatColor() + "\n");
                fw.write(ins.getTypeOfCoat() + "\n");
                fw.write(ins.getTailLength() + "\n");
                fw.write(ins.getBodyLength() + "\n");
                fw.write(ins.getWeight() + "\n");
                fw.write(ins.getHabitat() + "\n");
                fw.write(ins.getSound() + "\n---\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter fw = new FileWriter(pathMar, false)) {
            for (Marsupialia mar : lstMar) {
                fw.write(mar.getName() + "\n");
                fw.write(mar.getKind() + "\n");
                fw.write(mar.getCoatColor() + "\n");
                fw.write(mar.getTypeOfCoat() + "\n");
                fw.write(mar.getIsCaudate() + "\n");
                fw.write(mar.getTailLength() + "\n");
                fw.write(mar.getBodyLength() + "\n");
                fw.write(mar.getWeight() + "\n");
                fw.write(mar.getTypeOfFood() + "\n");
                fw.write(mar.getHabitat() + "\n");
                fw.write(mar.getSound() + "\n---\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter fw = new FileWriter(pathPlat, false)) {
            for (Platypus plat : lstPlat) {
                fw.write(plat.getName() + "\n");
                fw.write(plat.getTailLength() + "\n");
                fw.write(plat.getBodyLength() + "\n");
                fw.write(plat.getWeight() + "\n");
                fw.write(plat.getSound() + "\n---\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter fw = new FileWriter(pathPred, false)) {
            for (Predatory pred : lstPred) {
                fw.write(pred.getName() + "\n");
                fw.write(pred.getKind() + "\n");
                fw.write(pred.getCoatColor() + "\n");
                fw.write(pred.getTypeOfCoat() + "\n");
                fw.write(pred.getTailLength() + "\n");
                fw.write(pred.getBodyLength() + "\n");
                fw.write(pred.getWeight() + "\n");
                fw.write(pred.getHabitat() + "\n");
                fw.write(pred.getSound() + "\n");
                fw.write(pred.getAmountOfCanines() + "\n");
                fw.write(pred.getLengthOfCanines() + "\n---\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter fw = new FileWriter(pathPrim, false)) {
            for (Primates prim : lstPrim) {
                fw.write(prim.getName() + "\n");
                fw.write(prim.getKind() + "\n");
                fw.write(prim.getCoatColor() + "\n");
                fw.write(prim.getIsCaudate() + "\n");
                fw.write(prim.getTailLength() + "\n");
                fw.write(prim.getBodyLength() + "\n");
                fw.write(prim.getWeight() + "\n");
                fw.write(prim.getHabitat() + "\n");
                fw.write(prim.getSound() + "\n---\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter fw = new FileWriter(pathProb, false)) {
            for (Proboscis prob : lstProb) {
                fw.write(prob.getName() + "\n");
                fw.write(prob.getKind() + "\n");
                fw.write(prob.getCoatColor() + "\n");
                fw.write(prob.getTailLength() + "\n");
                fw.write(prob.getBodyLength() + "\n");
                fw.write(prob.getWeight() + "\n");
                fw.write(prob.getTypeOfFood() + "\n");
                fw.write(prob.getHabitat() + "\n");
                fw.write(prob.getSound() + "\n");
                fw.write(prob.getTrunkLength() + "\n---\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter fw = new FileWriter(pathRod, false)) {
            for (Rodent rod : lstRod) {
                fw.write(rod.getName() + "\n");
                fw.write(rod.getKind() + "\n");
                fw.write(rod.getCoatColor() + "\n");
                fw.write(rod.getTailLength() + "\n");
                fw.write(rod.getBodyLength() + "\n");
                fw.write(rod.getWeight() + "\n");
                fw.write(rod.getTypeOfFood() + "\n");
                fw.write(rod.getHabitat() + "\n");
                fw.write(rod.getSound() + "\n---\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
