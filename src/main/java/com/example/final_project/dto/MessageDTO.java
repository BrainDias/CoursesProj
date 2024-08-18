package com.example.final_project.dto;


/**
 * MessageDTO class which has only fields which need to be shown to user
 */
public class MessageDTO {
    private final int id;
    private final String text;
    private final String subject;
    private final UserDTO sender;
    private final UserDTO receiver;
    private final String status;

    /**
     * @param id message id generated by database
     * @param text text of message
     * @param subject message subject
     * @param sender user who sent message
     * @param receiver user who received message
     * @param status message status(READ or UNREAD)
     */
    public MessageDTO(int id, String text, String subject, UserDTO sender, UserDTO receiver, String status) {
        this.id = id;
        this.text = text;
        this.subject = subject;
        this.sender = sender;
        this.receiver = receiver;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public UserDTO getSender() {
        return sender;
    }

    public UserDTO getReceiver() {
        return receiver;
    }

    public String getSubject() {
        return subject;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "MessageDTO{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", subject='" + subject + '\'' +
                ", sender=" + sender +
                ", receiver=" + receiver +
                ", status='" + status + '\'' +
                '}';
    }
}
