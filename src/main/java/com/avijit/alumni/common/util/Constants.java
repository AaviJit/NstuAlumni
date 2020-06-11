package com.avijit.alumni.common.util;


public final class Constants {

    public static final Long MOBILE_IDENTIFIER = (long) 9999;
    public static final String ACCOUNTS = "Accounts";

    public static final String[] Allowance = {"Accounts", "Human Resource"};
    public static final String[] Tender = {"Accounts"};

    public static final String KEY_WORD_TRACKING = "Tracking";

    public static final class Roles {
        public static final String ROLE_ADMIN = "ROLE_ADMIN";
        public static final String ROLE_ADMIN_1 = "ROLE_ADMIN_1";
        public static final String ROLE_ADMIN_2 = "ROLE_ADMIN_2";
        public static final String ROLE_SUPER_ADMIN = "ROLE_SUPER_ADMIN";
        public static final String ROLE_EMPLOYEE = "ROLE_EMPLOYEE";
        public static final String ROLE_CUSTOMER = "ROLE_CUSTOMER";
        public static final String ROLE_RIDER = "ROLE_RIDER";
        public static final String ROLE_AGENT = "ROLE_AGENT";
        public static final String ROLE_MERCHANT = "ROLE_MERCHANT";
        public static final String ROLE_ACCOUNT = "ROLE_ACCOUNT";

        public static final String ROLE_ADMIN_LOCAL = "ROLE_ADMIN_LOCAL";
        public static final String ROLE_ADMIN_INTERNATIONAL = "ROLE_ADMIN_INTERNATIONAL";
    }

    public static final class RoleIds {
        public static final long ROLE_ADMIN_1 = 2;
        public static final long ROLE_ADMIN_2 = 3;
        public static final long ROLE_SUPER_ADMIN = 1;
        public static final long ROLE_EMPLOYEE = 4;
    }

    public static final class RequestStatus {
        public static final String REQUESTED = "requested";
        public static final String FORWARDED = "forwarded";
        public static final String APPROVED = "approved";
        public static final String DECLINED = "declined";
        public static final String CANCELLED = "cancelled";
    }

    public static final class Tasks {
        public static final String HOLIDAY = "holiday";
        public static final String TODO = "to-do";
        public static final String TASK = "task";
        public static final String NOTICE = "notice";
    }

    public static final class TaskStatus {
        public static final String GENERATED = "generated";
        public static final String ACKNOWLEDGED = "seen";
        public static final String COMPLETED = "completed";
        public static final String NOTAPPLICABLE = "N/A";
    }

    public static final class Days {
        public static final String WEEK_DAY = "week_day";
        public static final String WEEK_END = "week_end";
    }

    public static final class DaysOfWeek {
        public static final String SUNDAY = "Sunday";
        public static final String MONDAY = "Monday";
        public static final String TUESDAY = "Tuesday";
        public static final String WEDNESDAY = "Wednesday";
        public static final String THURSDAY = "Thursday";
        public static final String FRIDAY = "Friday";
        public static final String SATURDAY = "Saturday";
    }

    public static final class LeaveTypes {
        public static final String CASUAL_LEAVE = "Casual Leave";
        public static final String EARN_LEAVE = "Earn Leave";
        public static final String SICK_LEAVE = "Sick Leave";
        public static final String LEAVE_WITHOUT_PAY = "Leave Without Pay";
        public static final String SPECIAL_LEAVE = "Special Leave";
    }

    public static final class Dates {
        public static final String VALID_FORMAT = "E MMM dd HH:mm:ss z yyyy"; // For checking if date is valid
        public static final String ACCEPTED_FORMAT = "yyyy-MM-dd'T'HH:mm:ss"; // For data passing over API
        public static final String DATE_FORMAT = "yyyy-MM-dd";
        public static final String TIMEZONE = "Asia/Dhaka";
        public static final String DEVICE_FORMAT = "M/d/yyyy h:mm:ss a";
    }

    public static final class TypeOfTender {
        public static final String E_GP = "E-GP";
        public static final String MANUAL = "Manual";
    }

    public static final class TenderStatus {
        public static final String WHITE = "Decision Pending"; //yellow
        public static final String GREEN = "Received Work";
        public static final String RED = "BG or P/O NOT Cleared"; //pink
        public static final String YELLOW = "BG or P/O Cleared"; //grey
        public static final String CREAM = "Did not get work";
    }

    public static final class AmountOfTenderSecurityStatus {
        public static final String PENDING = "Decision Pending";
        public static final String RELEASE = "Release";
        public static final String RELEASED = "Released";
    }

    public static final class AmountOfTenderPerformanceSecurityStatus {
        public static final String PENDING = "Decision Pending";
        public static final String RELEASE = "Release";
        public static final String RELEASED = "Released";
    }

    public static final class EntityTenderStatus {
        public static final String CREATED = "Created";
        public static final String PENDING = "Decision Pending";
        public static final String GOT_WORK = "Got Work";
        public static final String DID_NOT_GET_WORK = "Did not get work";
    }

    public static final class CustomDepartments {
        public static final String SALES = "Sales";
        public static final String APPLICATION = "Application";
        public static final String OTHER = "Others";
    }

    public static final class CommissionCategory {
        public static final String LOCAL = "Local";
        public static final String FOREIGN = "Foreign";
    }

    public static final class ResourceType {
        public static final String TASK = "task";
        public static final String TENDER = "tender";
        public static final String CAR_REQUEST = "car_request";
        public static final String CAR_SCHEDULE = "car_schedule";
        public static final String LEAVE = "leave";
        public static final String BONUS = "bonus";
        public static final String COMMISSION = "commission";
        public static final String ATTENDANCE = "attendance";
        public static final String TOUR = "tour";
        public static final String ALLOWANCE = "allowance";
        public static final String PASSWORD_RESET = "password_reset";
        public static final String EXCEPTION_REQUEST = "exception_request";
        public static final String ASSIGN_ORDER = "order_assign";
    }

    public static final class Operations {
        public static final String CREATED = "created";
        public static final String UPDATED = "updated";
        public static final String REMOVED = "removed";
    }

    public static final class RiderWorkType {
        public static final String PICKUP = "PICKUP";
        public static final String DELIVERY = "DELIVERY";
        public static final String PICKUP_DELIVERY = "PICKUP_DELIVERY";

    }

    public static final class PaymentStatus {
        public static final String bKash = "bKash";
        public static final String Cash_On_Delivery = "Cash on Delivery";
        public static final String Online_Payment = "Online Payment";
        public static final String DUE = "due";
        public static final String PAID = "paid";
    }

    public static final class OrderStatus {
        public static final String CREATED = "Created";
        public static final String CONFIRMED = "Confirmed";
        public static final String PICKED_UP = "PickedUp";
        public static final String STORED = "Stored";
        public static final String DELIVERED = "Delivered";
        public static final String STORAGE_PICKED = "StoragePicked";
        public static final String RETURNED = "Returned";
        public static final String RESTORE = "Restore";


    }

}