package contentprovider.brulak.com.contentproviderexample;

import java.io.Serializable;
import java.util.Calendar;
public class NoteListItem {
    private String text;
    private String status;
    private Calendar date;

    public NoteListItem(String text) {
        this(text, "Open", Calendar.getInstance());
    }

    public NoteListItem(String text, String status, Calendar date){
        this.text = text;
        this.status = status;
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }
}