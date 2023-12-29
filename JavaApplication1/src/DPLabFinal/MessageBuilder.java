/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DPLabFinal;

/**
 *
 * @author fa20-bse-172
 */
public class MessageBuilder {
    private String content;

    public MessageBuilder setContent(String content) {
        this.content = content;
        return this;
    }

    public Message build() {
        return new Message(content);
    }
}
