package ws;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Compte {
    private int code;
    private double solde;
    private Date date;
}


