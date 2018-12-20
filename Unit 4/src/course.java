
public class course {
	
	private String title;
	private String teacherName;
	private String roomNumber;
	private int period;
	private String[] students;
	private boolean isStudentEnrolled;
	
	
	public course (String title, String taecherName, String roomNumber, int period, String[] students)
	{
		
	}
	
	public course()
	{
		
	}
	
	public void setTitle(String a)
	{
		this.title = a;
	}
	
	public String getTitle(String title)
	{
		return title;
	}
	
	public void setTeacherName(String a)
	{
		this.teacherName = a;
	}
	
	public String getTeacherName(String teacherName)
	{
		return teacherName;
	}
	
	public void setRoomNumber(String a)
	{
		this.roomNumber = a;
	}
	
	public String getRoomNumber(String roomNumber)
	{
		return roomNumber;
	}
	
	public void setperiod(int a)
	{
		this.period = a;
	}
	
	public int getPeriod(int a)
	{
		return a;
	}
	
	public void setStudents(String[] a)
	{
		this.students = a;
	}
	
	public String[] getStudents(String[] students)
	{
		return students;
	}
	
	public boolean isStudentEnrolled(String a, String[] students)
	{
		boolean isStudentEnrolled = false;
		for (int i = 0; i < students.length; i++)
		{
			if (students[i].contains(a))
			{
				isStudentEnrolled = true;
			}
		}
		return isStudentEnrolled;
	}
}
	