package top.codekiller.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestElasticsearchApplicationTests {

    @Test
    void contextLoads() {
        //初始化数组
        int[] a=new int[110];

        for(int i=0; i<100; i++)
        {
            a[i] = (int)(Math.random()*500);
            System.out.print("a["+i+"]="+a[i]+"   ");
        }
        System.out.println();
        System.out.println("第83个元素是"+Select(a,0,99,83));

        for(int i=0; i<100; i++)
        {
            System.out.print("a["+i+"]="+a[i]+"   ");
        }


        //重新排序，对比结果
        BubbleSort(a,0,99);

        for(int i=0; i<100; i++)
        {
            System.out.print("a["+i+"]="+a[i]+"   ");
        }

    }

    void Swap(int x,int y)
    {
        int temp = x;
        x = y;
        y = temp;
    }



    //冒泡排序
    int[] BubbleSort(int[] a,int p,int r)
    {
        //记录一次遍历中是否有元素的交换
        boolean exchange;
        for(int i=p; i<=r-1;i++)
        {
            exchange = false ;
            for(int j=p; j<=r-1; j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    exchange = true;
                }
            }
            //如果这次遍历没有元素的交换,那么排序结束
            if(false == exchange)
            {
                break ;
            }
        }
        return a;
    }

 
    int Partition(int[] a,int p,int r,int x)
    {
        int i = p-1,j = r + 1;

        while(true)
        {
            while(a[++i]<x && i<r);
            while(a[--j]>x);
            if(i>=j)
            {
                break;
            }
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        return i;
    }


    int Select(int[] a,int p,int r,int k)
    {
        if(r-p<75)
        {
            BubbleSort(a,p,r);

            return a[p+k-1];
        }

        //(r-p-4)/5相当于n-5
        for(int i=0; i<=(r-p-4)/5; i++)
        {
            //将元素每5个分成一组，分别排序，并将该组中位数与a[p+i]交换位置
            //使所有中位数都排列在数组最左侧，以便进一步查找中位数的中位数
            a=BubbleSort(a,p+5*i,p+5*i+4);
            int temp=a[p+5*i+2];
            a[p+5*i+2]=a[p+i];
            a[p+i]=temp;
        }

        //找中位数的中位数
        int x = Select(a,p,p+(r-p-4)/5,(r-p-4)/10);
        int i = Partition(a,p,r,x);
        int j = i-p+1;
        if(k<=j)
        {
            return Select(a,p,i,k);
        }
        else
        {
            return Select(a,i+1,r,k-j);
        }
    }


    @Test
    public void test2(){
        int[] arr={0,1,2,3,4,5,6,7};
        Partition(arr,0,7);

    }

    int Partition (int[] a, int p, int r)
    {
        int i = p, j = r + 1;
        int x=a[p];
        // 将< x的元素交换到左边区域
        // 将> x的元素交换到右边区域
        while (true) {
            while (a[++i] <x&&i<r);
            while (a[--j] >x);
            if (i >= j) break;
            Swap(a[i], a[j]);
        }
        a[p] = a[j];
        a[j] = x;
        return j;
    }


}
