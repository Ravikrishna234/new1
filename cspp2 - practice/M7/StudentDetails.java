class StudentDetails{
	public StudentDetails()
	{
	}
	float gpa(float m1, float m2, float m3)
	{
		return (m1 + m2 + m3) / 3;
	}
	public static void main(String[] args)
	{
		StudentDetails s1 = new StudentDetails();
		StudentDetails s2 = new StudentDetails();
		StudentDetails s3 = new StudentDetails();
		System.out.println(s1.gpa(7.5f,7.0f,8.0f));
		System.out.format("%.1f\n",s2.gpa(8.5f,6.0f,7.5f));
		System.out.format("%.1f\n",s3.gpa(7.5f,8.0f,9.0f));

	}
	
}