class Datatypes
{
		byte bytevar;
		short shortvar;
		long longvar;
		int intvar;
		boolean boolvar;
		float floatvar;
		double doublevar;
		char charvar;
		void Defaultvalues()
		{
			System.out.println("byte:"+bytevar);
			System.out.println("short:"+shortvar);
			System.out.println("int:"+intvar);
			System.out.println("long:"+longvar);
			System.out.println("float:" +floatvar);
			System.out.println("double:" +doublevar);
			System.out.println("char:"+charvar);
			System.out.println("boolean:"+boolvar);
		}
		public static void main(String[] args)
		{
			Datatypes P=new Datatypes();
			P.Defaultvalues();
		}
}


