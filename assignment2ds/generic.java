//generic classes and 
//you can not have premitive types as unknown types ,angle brackets<> mein jhan pr string,integer likha ha whan pr int,char,boolean nahi aa sakta ha 
class GenericTypes<T extends Object>//T yhan pr represent kr rha unknown type ko ye koi bhi class aa skti ha T ki jagh ye hm bad btayenge ki kon si class ayegi
{//THIS is called bounded type
	T x;
	public void show()
{
	System.out.println(x);
}
public void set(T m)
{
	this.x=m;
}
public T get()
{
	return x;
}
}
class example
{
public static void main(String[]args)
{
//yhan pr hmne specify kiya ha ki T ki jagh string ayegi
	GenericTypes<String> A=new GenericTypes<String>();
//	Upar wali line ke execute hone ke bad generic types ek esi class banti ha jisme enter a comment 1 ek refference ha x string type ka
	//2.ek method ha set jo ek string accept krta ha or uski value 
	//3.ek metod ha get jo kuch accept nhi krta but ek string return krta ha
	A.set("Hell of a world");
	A.show();
	String str2=A.get();
	System.out.println(str2);
GenericTypes<Integer> B=new GenericTypes<Integer>();
B.set(42);
	B.show();
	Integer x=B.get();
	System.out.println(x);
}

}