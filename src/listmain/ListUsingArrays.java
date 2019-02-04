package listmain;

public class ListUsingArrays {
    //mylist to store elements
    private int[] mylist;

    //index position to insert and delete

    private int last;

    //create parameterized constructor


    public ListUsingArrays(int[] mylist, int last) {
        this.mylist = mylist;
        this.last = last;
    }

    public void insert(int element){

        if(last<mylist.length-1){
            last++;
            mylist[last]=element;
        }
        else{
            System.out.println("list is full");
        }

    }
    public void delete(){
        if(last>=0){
            mylist[last]=0;
            last--;
        }
    }
    //searching first occurence of given element
    public boolean search(int element){
        boolean response=false;
        for(int i=0;i<=last;i++){
            if(mylist[i]==element){
                response=true;
                break;
            }
        }

        return response;
    }

    public void sort(){
        for(int i=0;i<last;i++){
            for(int j=0;j<last;j++){
                if(mylist[j]>mylist[j+1]){
                    int temp=mylist[j];
                    mylist[j]=mylist[j+1];
                    mylist[j+1]=temp;
                }
            }
        }
    }
    public void display(){
        System.out.println("mylist");
        for(int i=0;i<=last;i++){
            System.out.print(mylist[i]+",\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int size=5;

        int[]mylist1=new int[size];

        int last=-1;

        ListUsingArrays obj=new ListUsingArrays(mylist1,last);

        obj.display();

        obj.insert(205);

        obj.display();
        obj.insert(12);
        obj.display();

        obj.sort();

        obj.display();
        obj.delete();
        obj.display();

        if(obj.search(12)){
            System.out.println("element found");
        }
        else{
            System.out.println("not found");
        }


    }




}








