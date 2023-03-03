import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpRequestExample {
    public static void main(String[] args) throws IOException, InterruptedException {
        // tạo một đối tượng HttpClient
        HttpClient client = HttpClient.newHttpClient();

        // tạo một đối tượng HttpRequest với URL của yêu cầu GET
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://example.com"))
                .build();

        // gửi yêu cầu và nhận phản hồi
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // in ra mã trạng thái và nội dung phản hồi
        System.out.println("Status code: " + response.statusCode());
        System.out.println("Response body: " + response.body());
    }
}
