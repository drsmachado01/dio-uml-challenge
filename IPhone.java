public class IPhone {
    private Player player;
    private Phone phone;
    private WebBrowser WebBrowser;

    public IPhone(Player player, Phone phone, WebBrowser WebBrowser) {
        this.player = player;
        this.phone = phone;
        this.webBrowser = webBrowser;
    }

    public Player getPlayer() {
        return this.player;
    }

    public Phone getPhone() {
        return this.phone;
    }

    public WebBrowser getWebBrowser() {
        return this.webBrowser;
    }
}