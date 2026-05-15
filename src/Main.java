package src;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 1. 创建电影列表（模拟数据库）
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(1, "流浪地球3", "科幻灾难片，票房火爆"));
        movies.add(new Movie(2, "封神第二部", "神话史诗大片"));

        Scanner scanner = new Scanner(System.in);

        // 2. 显示电影列表
        System.out.println("=== 电影列表 ===");
        for (Movie m : movies) {
            System.out.println(m.getId() + ". " + m.getName());
        }

        // 3. 用户输入电影编号
        System.out.print("请输入电影编号查看详情：");
        int choice = scanner.nextInt();

        // 4. 显示电影详情
        boolean found = false;
        for (Movie m : movies) {
            if (m.getId() == choice) {
                System.out.println("电影名称：" + m.getName());
                System.out.println("电影简介：" + m.getDescription());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("未找到该电影");
        }

        scanner.close();
    }
}