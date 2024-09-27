package Directory;

import Employ.Employ;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class EmployDirectory {
    private ArrayList<Employ> employList;

    public EmployDirectory(){
        employList = new ArrayList<>();
    }

    public void addEmploy(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя нового сотрудника: ");
        String name = scanner.nextLine();
        System.out.println("Номер телефона: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Табельный номер: ");
        int tabNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Стаж: ");
        int experience = Integer.parseInt(scanner.nextLine());
        employList.add(new Employ(tabNumber,phoneNumber,name,experience));
    }

    public void addEmploy(String name,int tabNumber, int phoneNumber, int experience){
        employList.add(new Employ(tabNumber,phoneNumber,name,experience));
    }

    public ArrayList<Employ> searchByExperience (int experience){
        ArrayList<Employ> result = new ArrayList<>();
        for(Employ employ:this.employList){
            if(employ.getExperience()>=experience) result.add(employ);
        }
        return result;
    }

    public ArrayList<Integer> searchPhoneByName (String name){
        ArrayList<Integer> result = new ArrayList<>();
        for(Employ employ:this.employList){
            if(Objects.equals(employ.getName(), name)){
                result.add(employ.getPhoneNumber());
            }
        }
        return result;
    }

    public Employ searchByTab (int tabNumber){
        for(Employ employ:this.employList){
            if(employ.getTabNumber()==tabNumber){
                return employ;
            }
        }
        return null;
    }
}
