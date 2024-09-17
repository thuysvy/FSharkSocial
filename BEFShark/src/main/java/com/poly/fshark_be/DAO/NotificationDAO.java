package com.poly.fshark_be.DAO;

import com.poly.fshark_be.model.Notifications;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationDAO  extends JpaRepository<Notifications, Integer>
{
}
