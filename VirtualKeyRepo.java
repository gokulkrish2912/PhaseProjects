package virtualkeyforyourrepositories;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class VirtualKeyRepo {

	    public static void main(String[] args)  {
	        File NewFolder = new File("D:\\Github\\Virtual Key For Your Repository");
	        NewFolder.mkdirs(); 
	        Scanner sc = new Scanner(System.in);

	        while(true){

	            System.out.println("Prototype of the Application Page\n");
	            System.out.println("These are the functions: \n");
	            System.out.println("Select Option 1 : To display the files in ascending order\n");
	            System.out.println("Select Option 2 : Here are some Business level operation menu \n");
	            System.out.println("Select Option 3 : Exit from the application");
	            System.out.println("Which function you want to proceed : \n");

	            int Choice1 = sc.nextInt();
	            switch(Choice1)
	            {
	                case 1:

	                    File a[] = NewFolder.listFiles();
	                    Arrays.sort(a);

	                    for(int i=0;i<a.length;i++)
	                        System.out.println(a[i]);
	                        break;


	                case 2:
	                    Boolean Temp = true;
	                    while(Temp) {
	                        System.out.println("Select Option 1 : To Add a file in the existing directory");
	                        System.out.println("Select Option 2 : To Delete a file from the existing directory");
	                        System.out.println("Select Option 3 : To Search a user specified file from the directory");
	                        System.out.println("Select Option 4 : Back to the previous menu");
	                        System.out.println("Select Option 5 : Application Exit Successfully");


	                        int choice2 = sc.nextInt();

	                        switch (choice2) {
	                        case 1:
	                        	System.out.println("Enter the File Name to create :");
	        					String Str = sc.next();
	        					File file = new File(NewFolder, Str);

	        					try {
	        						boolean Value = file.createNewFile();
	        						if (Value) {
	        							System.out.println("The new file is created.");
	        						} else {
	        							System.out.println("The file already exists.");
	        						}
	        					} catch (Exception e) {
	        						e.getStackTrace();
	        					}

	                                break;
	             
	                            case 2:
	                            	System.out.println("Enter the File Name :");
	            					String Name = sc.next();
	            					File file1 = new File(NewFolder, Name);

	            					try {
	            						boolean Value = file1.delete();
	            						if (Value) {
	            							System.out.println("File deleted Successfully.");
	            						} else {
	            							System.out.println("File Not Found.");
	            						}
	            					} catch (Exception e) {
	            						e.getStackTrace();
	            					}
	            					break;


	                            case 3:
	                            	System.out.println("Enter a keyword to search :");
	            					String Search = sc.next();
	            					boolean Flag1 = false;
	            					File a1[] = NewFolder.listFiles();
	            					System.out.println("File Found :\n");
	            					for (int i = 0; i < a1.length; i++) {
	            						if (a1[i].getName().startsWith(Search)) {
	            							Flag1 = true;
	            							System.out.println(a1[i]);
	            						}
	            					}
	            					if (Flag1 == false) {
	            						System.out.println("No file found.");
	            					}

	                            case 4:

	                                Temp = false;
	                                break;

	                            case 5:

	                                System.out.println("Exit from the application Successfully.");
	                                System.exit(0);
	                            default:
	                                System.out.println("Input correct value and retry.");

	                        }

	                    }
	                    break;

	                case 3:
	                    System.out.println("Application Exit Successfully.");
	                    System.exit(0);

	                default:
	                    System.out.println("Input correct value and retry.");
	                    break;

	            }
	        }
	    }
	}

