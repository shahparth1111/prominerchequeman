 // AT MAX -> 1388887 EMPLOYEES ( TO CALCUTATE YEARLY SALARY )
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
public class ReadFile
{
    private String path;
    public ReadFile(String file_path)
    {
        path=file_path;
    }
    public String[] OpenFile()throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader(path));
        int nol=50,i;
        String[] S=new String[nol]; 
        for(i=0;i<nol;i++)
        {
            S[i]=br.readLine();
        }
        br.close();
        return S;
    }
    @SuppressWarnings("unused")
	int readlines()throws IOException
    {
        BufferedReader bf = new BufferedReader(new FileReader(path));
        String aLine;int nol=0;
        while(( aLine=bf.readLine()) != null) 
        {
            nol++; 
        }
        bf.close();
        return nol;
    }
}