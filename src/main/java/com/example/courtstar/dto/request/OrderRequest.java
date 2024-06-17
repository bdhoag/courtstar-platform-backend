package com.example.courtstar.dto.request;

import com.example.courtstar.entity.BookingSchedule;
import com.example.courtstar.entity.Centre;
import com.example.courtstar.entity.Payment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderRequest{
    private BookingSchedule bookingSchedule;
    private Payment payment;
    private Centre centre;

    @Builder.Default
    private String callbackUrl="https://7d2f-118-69-182-149.ngrok-free.app/courtstar/payment/booking-callback";;

}
