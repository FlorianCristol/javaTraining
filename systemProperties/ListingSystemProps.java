public class ListingSystemProps {
	public static void main(String[] args){
		System.out.println("Listing system properties:");
		System.out.println("File separator:");
		System.out.println(System.getProperty("file.separator"));
		System.out.println("Class path:");
		System.out.println(System.getProperty("java.class.path"));
		System.out.println("Installation directory of the JRE:");
		System.out.println(System.getProperty("java.home"));
		System.out.println("JRE Vendor name: ");
		System.out.println(System.getProperty("java.vendor"));
		System.out.println("JRE Vendor URL:");
		System.out.println(System.getProperty("java.vendor.url"));
		System.out.println("JRE Version number:");
		System.out.println(System.getProperty("java.version"));
		System.out.println("Sequence used by OS to separate lines in text files:");
		System.out.println(System.getProperty("line.separator"));
		System.out.println("Operating system architecture:");
		System.out.println(System.getProperty("os.arch"));
		System.out.println("OS Name");
		System.out.println(System.getProperty("os.name"));
		System.out.println("User working directory:");
		System.out.println(System.getProperty("user.dir"));
	}
}