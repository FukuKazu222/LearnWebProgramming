package dao;

public class giveMeTheData {

	Employee emp = empDao.findById(’'' OR '' = ''");
			System.out.println("ID:" + emp.getId());
			System.out.println("名前:" + emp.getName());
			System.out.println("年齢:" + emp.getAge());
}
