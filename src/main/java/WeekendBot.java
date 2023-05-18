import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class WeekendBot extends TelegramLongPollingBot {

    public static void main(String[] args) throws TelegramApiException {
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(new WeekendBot());
    }

    @Override
    public String getBotUsername() {
        return "Weekend_Bot";
    }

    @Override
    public String getBotToken() {
        return "6109799842:AAE6zUGc5zlIsUleHmBcpVOKEZWk2hHbNsM";
    }

    @Override
    public void onUpdateReceived(Update update) {

    }
}
