/**
 * 
 */
package exceptionHandling;

/**
 * @author hp
 *
 */

	public class CustomExceptionMessage extends Exception {

		private int exceptionCode;
		private String exceptionMessage;

		public CustomExceptionMessage() {

		}
		public CustomExceptionMessage(int exceptionCode, String exceptionMessage) {
		this.exceptionCode = exceptionCode;
		this.exceptionMessage = exceptionMessage;
		System.out.println("error code : " + exceptionCode + " error message : " + exceptionMessage);
		}
		/**
		* @return the exceptionCode
		*/
		public int getExceptionCode() {
		return exceptionCode;
		}
		/**
		* @param exceptionCode the exceptionCode to set
		*/
		public void setExceptionCode(int exceptionCode) {
		this.exceptionCode = exceptionCode;
		}
		/**
		* @return the exceptionMessage
		*/
		public String getExceptionMessage() {
		return exceptionMessage;
		}
		/**
		* @param exceptionMessage the exceptionMessage to set
		*/
		public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
		}

		}

