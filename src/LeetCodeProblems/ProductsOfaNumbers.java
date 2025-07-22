package LeetCodeProblems;
import java.util.*;
class ProductsOfaNumbers {
    List<Integer> list;
    List<Integer> prod;
    int zero;
    int size;
    public ProductsOfaNumbers() {
        list = new ArrayList<>();
        prod = new ArrayList<>();
        zero = -2;
        size = 0;
    }

    public void add(int num) {
        if(num==0) zero = size;
        if(size==0){

            prod.add(num);
            list.add(num);
            size++;
            return;
        }
        if(zero == size-1){
            prod.add(num);
        }else{
            prod.add(prod.get(prod.size()-1) * num);
        }


        list.add(num);
        size++;
    }

    public int getProduct(int k) {
        if(size==1) return prod.get(k-1);
        if(k >= size-zero) return 0;
        if(k+1 == size-zero ) return prod.get(size-1);
        return prod.get(size-1)/prod.get(size-k-1);
    }

    public static void main(String[] args) {
        ProductsOfaNumbers pn = new ProductsOfaNumbers();
        pn.add(7);
//        pn.add(0);
//        pn.add(2);
//
        System.out.println(pn.getProduct(1));
        System.out.println(pn.getProduct(1));

        pn.add(4);
        pn.add(5);
        System.out.println(pn.getProduct(3));
        pn.add(4);
        System.out.println(pn.getProduct(4));


    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */