
@RequestMapping("/")
public class IndexController extends JbootController {

    public void index() {
        renderText("Hello World Jboot");
    }


    public static void main(String[] args) {
        JbootApplication.run(args);
    }
}
