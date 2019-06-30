package concrete;

import framework.Item;
import framework.ItemCreater;
import java.util.Date;

public class MpPotionCreater extends ItemCreater{

    @Override
    protected void requestItemsInfo() {
        System.out.println("데이터 베이스에서 마력 회복 물약 정보를 가져옴");
    }

    @Override
    protected void createItemLog() {
        System.out.println("마력 물약 생성" + new Date());
    }

    @Override
    protected Item createItem() {
        return new MpPotion();
    }
    
}
