package Exep3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Controller {
    public void run()
    {
        User user;
        try {
            user = parse(getDataUser());
            save(user);
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    private String getDataUser()
    {
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите фамилию: ");
        sb.append(scanner.nextLine() + " ");
        System.out.println("Введите имя: ");
        sb.append(scanner.nextLine() + " ");
        System.out.println("Введите отчество: ");
        sb.append(scanner.nextLine() + " ");
        System.out.println("Введите дату рождения(формат dd.mm.yyyy): ");
        sb.append(scanner.nextLine() + " ");
        System.out.println("Введите номер телефона: ");
        sb.append(scanner.nextLine() + " ");
        System.out.println("Введите пол(f, m): ");
        sb.append(scanner.nextLine() + " ");
        return sb.toString();
    }

    private User parse(String data) throws Exception
    {
        User user = new User();
        int index = 0;
        String[] resData = data.split("\\s+");
        if (resData.length != 6)
            throw new Exception("Введено не верное количество данных");
        for (String subLine : resData) {
            if(subLine.charAt(0) >= '0' && subLine.charAt(0) <= '9')
            {
                if(subLine.indexOf('.') > -1)
                {
                    user.setBirthday(parseDateTime(subLine));
                } else if (user.getPhoneNumber() == null)
                {
                    user.setPhoneNumber(parseNumber(subLine));
                }
                else
                    throw new RuntimeException("Неверный формат дланных");
            }
            else if (subLine.length() == 1) {
                user.setGender(parseGender(subLine));
            } else
            {
                switch (index)
                {
                    case 0:
                        user.setFiretName(subLine);
                        break;
                    case 1:
                        user.setName(subLine);
                        break;
                    case 2:
                        user.setSecondName(subLine);
                        break;
                }
                index++;
            }
        }
        if(user.getGender() == null || user.getGender() == "")
            throw new RuntimeException("Неверный формат данных пола");
        return user;
    }

    private String parseDateTime(String date) throws Exception
    {
        var res = date.split("\\.");
        if(res.length != 3)
        {
            throw new RuntimeException("Неверный формат даты");
        }
        for ( var line : res) {
            try {
                Integer.parseInt(line);
            }
            catch (NumberFormatException nex)
            {
                throw new RuntimeException("Неверный формат даты");
            }
        }
        return date;
    }

    private String parseNumber(String data) throws NumberFormatException
    {
        try {
            Integer.parseInt(data);
        }
        catch (NumberFormatException nex)
        {
            throw new NumberFormatException("Неверный формат номера телефона");
        }
        return data;
    }

    private String parseGender(String data) throws RuntimeException
    {
        if(data.equals("f") || data.equals("m"))
            return data;

        throw new RuntimeException("Неверный формат данных пола");
    }

    private String check() throws IOException
    {
        File fileDir = new File(System.getProperty("user.dir"));
        File file = new File(fileDir.getPath(),"DataUsers");
        if(!file.exists())
            file.mkdir();
        return file.getAbsolutePath();
    }
    private void check(String path) throws IOException
    {
        File file = new File("DataUsers");
        if(!file.exists())
            file.createNewFile();
    }
    private void save(User user) throws Exception   
    {
        var nameDir = check();
        //check(user.getFiretName() + ".txt");

        try(FileWriter fw = new FileWriter(nameDir + "/" + user.getFiretName() + ".txt", true))
        {
            fw.write(user.toString());
            fw.append('\n');
            //fw.flush();
        }catch (Exception ex)
        {
            throw new RuntimeException("Ошибка в сохранении " + ex.getMessage());
        }
    }
}
