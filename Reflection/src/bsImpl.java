/**
 * Created by YanMing on 2017/3/20.
 */
public class bsImpl implements BorrowService{
    @Override
    public void borrowBook() {
        System.out.println("Borrow Book");
    }

    @Override
    public void borrowOthers(String str) {
        System.out.println("Borrow " + str);
    }
}