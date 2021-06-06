package Control;

public class RemoteCtrl {
    private Command[][] buttons;
    private Light[] lights; //1:����һ���������

    public void RemoteCtrl(){
        lights = new Light[5]; //2:�����������
        buttons = new Command[5][2];

        for (int i=0;i<buttons.length;i++){
            lights[i] = new Light(i); //3:����n������Ԫ��
            buttons[i][0] = new LightOnCommand(lights[i]);
            buttons[i][1] = new LightOffCommand(lights[i]);

        }
    }

    public void pressOnButton(int index){
        buttons[index][0].execute();
    }
    public void pressOffButton(int index){
        buttons[index][1].execute();
    }
}
