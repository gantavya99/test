

public class hashing {
    class MyHash{

    
    int a[];
    int cap,size;
    MyHash(int c){
        cap=c;
        size=0;
        for(int i=0;i<cap;i++)
        a[i]=-1;
    }
     int hash(int key){
        return key%cap;
    }
        boolean search(int key){
            int h=hash(key);
            int i=h;
            while(a[i]!=-1){
                if(a[i]==key)
                return true;
                i=(i+1)%cap;
                if(i==h)
                return false;
            }
            return false;
        }
        boolean insert(int key){
          
            if(size==cap)
            return false;
            int i=hash(key);
            while(a[i]!=-1&&a[i]!=-2&&a[i]==key){
                i=(i+1)%cap;
                if(a[i]==key)
                return false;
                else
                {
                    a[i]=key;
                    size++;
                    return true;
                }
            }
            return false;
        }
        boolean delete(int key){
            int h =hash(key);
            int i=h;
            while(a[i]!=-1){
                if(a[i]==key)
                { a[i]=-2;
                    return true;
                }
                i=(i+1)%cap;
                if(i==h)
                return false;

                }

            return false;
        }

    }
    
    
}
