public class xGioyPhutzGiay {
    public static void main(String[] args) {
        int gio = 23;
        int phut = 59;
        int giay = 59;
        int tongsogiay = gio * 3600 + phut * 60 + giay;
        tongsogiay += 1;
        gio = (tongsogiay / 3600) % 24;
        phut = (tongsogiay % 60) % 60;
        giay = tongsogiay % 60;
        System.out.println(gio + ":" + phut + ":" + giay);
    }
}
