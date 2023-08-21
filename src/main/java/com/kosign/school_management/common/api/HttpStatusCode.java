package com.kosign.school_management.common.api;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum HttpStatusCode {

    // 1xx Informational

    // 2xx Success
    OK(200, HttpStatus.Series.SUCCESSFUL, "OK"),
    SUCCESS(200, HttpStatus.Series.SUCCESSFUL, "OK"),

    /* 3xx Redirection */

    // --- 4xx Client Error ---
    BAD_REQUEST(400, HttpStatus.Series.CLIENT_ERROR, "Bad Request"),

    UNAUTHORIZED(401, HttpStatus.Series.CLIENT_ERROR, "Unauthorized"),

    PAYMENT_REQUIRED(402, HttpStatus.Series.CLIENT_ERROR, "Payment Required"),

    FORBIDDEN(403, HttpStatus.Series.CLIENT_ERROR, "Forbidden"),

    NOT_FOUND(404, HttpStatus.Series.CLIENT_ERROR, "Not Found"),

    ID_NOT_FOUND(404, HttpStatus.Series.CLIENT_ERROR, "ID NOT Found");


    private final int value;
    private final HttpStatus.Series series;
    private final String reasonPhrase;
    HttpStatusCode(int value, HttpStatus.Series series, String reasonPhrase) {
        this.value = value;
        this.series = series;
        this.reasonPhrase = reasonPhrase;
    }

    //
    public enum Series {
        INFORMATIONAL(1),
        SUCCESSFUL(2),
        REDIRECTION(3),
        CLIENT_ERROR(4),
        SERVER_ERROR(5);

        private final int value;

        Series(int value) {
            this.value = value;
        }

        public int value() {
            return this.value;
        }

        /**
         * Return the {@code Series} enum constant for the supplied {@code HttpStatus}.
         * @param status a standard HTTP status enum constant
         * @return the {@code Series} enum constant for the supplied {@code HttpStatus}
         * @deprecated as of 5.3, in favor of invoking {@link HttpStatus#series()} directly
         */
//        @Deprecated
//        public static HttpStatus.Series valueOf(HttpStatus status) {
//            return status.series;
//        }

        /**
         * Return the {@code Series} enum constant for the supplied status code.
         * @param statusCode the HTTP status code (potentially non-standard)
         * @return the {@code Series} enum constant for the supplied status code
         * @throws IllegalArgumentException if this enum has no corresponding constant
         */
//        public static HttpStatus.Series valueOf(int statusCode) {
//            HttpStatus.Series series = resolve(statusCode);
//            if (series == null) {
//                throw new IllegalArgumentException("No matching constant for [" + statusCode + "]");
//            }
//            return series;
//        }

        /**
         * Resolve the given status code to an {@code HttpStatus.Series}, if possible.
         * @param statusCode the HTTP status code (potentially non-standard)
         * @return the corresponding {@code Series}, or {@code null} if not found
         * @since 5.1.3
         */
//        @Nullable
//        public static HttpStatus.Series resolve(int statusCode) {
//            int seriesCode = statusCode / 100;
//            for (HttpStatus.Series series : values()) {
//                if (series.value == seriesCode) {
//                    return series;
//                }
//            }
//            return null;
//        }
    }


}
