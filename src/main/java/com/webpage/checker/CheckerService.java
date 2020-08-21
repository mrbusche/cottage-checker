package com.webpage.checker;

import com.webpage.checker.helper.CheckerHelper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class CheckerService {
    String retrieveHTML(String url) throws IOException {
        Document doc = Jsoup.connect(url).get();
        Elements els = doc.getElementsByClass(Checker.CALENDAR_ELEMENT);
        return CheckerHelper.removeStuff(els.toString());
    }

    int retrieveReviewCount(String url) throws IOException {
        Document doc = Jsoup.connect(url).get();
        Elements els = doc.getElementsByClass(Checker.REVIEWS_ELEMENT);
        return els.size();
    }
}
