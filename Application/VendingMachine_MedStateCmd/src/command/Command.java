package command;

public interface Command {
    // if-else 문을 줄이는 방법 : command 패턴 + hashMap 사용하기
    public void execute(int data);
}
