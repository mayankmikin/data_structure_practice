package heap;

/**
 * Created by maverma on 07/06/16.
 */
public class Node
{
    public Integer leftnode;
    public Integer rightnode;
    public Integer heap[];
    public static  Integer pos=0;

    public Node(Integer[] heap)
    {
        this.heap = heap;
    }

    public int getLeftnode() {
        return leftnode;
    }

    public void setLeftnode(int leftnode) {
        this.leftnode = leftnode;
    }

    public int getRightnode() {
        return rightnode;
    }

    public void setRightnode(int rightnode) {
        this.rightnode = rightnode;
    }

    public Integer[] getHeap() {
        return heap;
    }
    public void insert(final int element)
    {
        if (pos>=0 && pos <=heap.length)
        {
            if(this.heap[pos]== null )
            {
                heap[pos]=element;
                pos++;

            }
        }
    }
    public void findparent(Integer position)
    {

    }
    public void isLeafNode(Integer position)
    {

    }
    public void minheapify(Integer position)
    {
        Integer parent_POS = (this.heap.length-1)/2;
        if(parent_POS >=0 )
        {
            if(this.heap[parent_POS]>this.heap[position])
            {
                Integer temp=this.heap[parent_POS];
                this.heap[parent_POS]=this.heap[position];
                this.heap[position]=temp;
            }
            this.minheapify(parent_POS);

        }

    }


}
