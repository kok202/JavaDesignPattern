package designpattern14_observer1;

public class Button {
    private OnClickListener onClickListener;
    
    public void onClick(){
        // update
        if(onClickListener != null)
            onClickListener.onClick(this);
    }
    
    public void setOnClickListener(OnClickListener onClickListener){
        // set observer
        this.onClickListener = onClickListener;
    }
}
