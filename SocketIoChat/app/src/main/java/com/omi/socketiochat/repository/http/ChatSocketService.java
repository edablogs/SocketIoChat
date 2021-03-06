package com.omi.socketiochat.repository.http;



import com.omi.socketiochat.objects.Message;

import io.reactivex.Completable;
import io.reactivex.Observable;

public interface ChatSocketService {

    Completable connectToServer(String mUsername);
    Completable disconnectFromServer();
    Completable connectError();
    Observable<Message> newMessage(Message message);
    Observable<Message> uploadImage(Message message);
    Completable userJoined(Message message);
    Completable userLeft(Message message);
    Completable typing(Message message);
    Completable stopTyping(Message message);




    Observable<Message> newMessageCallback();
    Observable<Message> typingCallback();
    Observable<Message> stopTypingCallback();
    Observable<Message> userJoinedCallback();
    Observable<Message> userLeftCallback();
    Observable<Message> newMessageImageCallback();


    boolean isConnected();


}
