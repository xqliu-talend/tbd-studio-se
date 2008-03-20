// ============================================================================
package java_project_5.delete_all_root_and_subdir_files;

import routines.libs;
import routines.randomGenerator;
import routines.DataOperation;
import routines.Mathematical;
import routines.Numeric;
import routines.Relational;
import routines.StringHandling;
import routines.TalendDataGenerator;
import routines.TalendDate;
import routines.TalendString;
import routines.system.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;

/**
 * Job: delete_all_root_and_subdir_files Purpose: <br>
 * Description: <br>
 * 
 * @author a@a.fr
 * @version 0_1
 * @status
 */
public class delete_all_root_and_subdir_files0_1 {
	// create and load default properties
	private static java.util.Properties defaultProps = new java.util.Properties();

	// create application properties with default
	private static class ContextProperties extends java.util.Properties {

		public ContextProperties(java.util.Properties properties) {
			super(properties);
		}

		public ContextProperties() {
			super();
		}

		public static String directory;
	}

	private static ContextProperties context = new ContextProperties();
	private static final String jobName = "delete_all_root_and_subdir_files";
	private static final String projectName = "JAVA_PROJECT_5";
	public static Integer errorCode = null;
	private static String currentComponent = "";
	private static final java.util.Map<String, Long> start_Hash = new java.util.HashMap<String, Long>();
	private static final java.util.Map<String, Long> end_Hash = new java.util.HashMap<String, Long>();
	private static final java.util.Map<String, Boolean> ok_Hash = new java.util.HashMap<String, Boolean>();
	private static final java.util.Map<String, Object> globalMap = new java.util.HashMap<String, Object>();
	public static final java.util.List<String[]> globalBuffer = new java.util.ArrayList<String[]>();

	private class TalendException extends Exception {
		private Exception e = null;
		private delete_all_root_and_subdir_files0_1 c = null;

		private TalendException(delete_all_root_and_subdir_files0_1 c,
				Exception e) {
			this.e = e;
			this.c = c;
		}

		@Override
		public void printStackTrace() {
			if (!(e instanceof TalendException || e instanceof TDieException)) {
				globalMap.put(currentComponent + "_ERROR_MESSAGE", e
						.getMessage());
				System.err
						.println("Exception in component " + currentComponent);
			}
			if (!(e instanceof TDieException)) {
				e.printStackTrace();
			}
			if (!(e instanceof TalendException)) {
				try {
					for (java.lang.reflect.Method m : this.getClass()
							.getEnclosingClass().getMethods()) {
						if (m.getName().compareTo(currentComponent + "_error") == 0) {
							m.invoke(c, new Object[] { e });
							break;
						}
					}

				} catch (java.lang.SecurityException e) {
					this.e.printStackTrace();
				} catch (java.lang.IllegalArgumentException e) {
					this.e.printStackTrace();
				} catch (java.lang.IllegalAccessException e) {
					this.e.printStackTrace();
				} catch (java.lang.reflect.InvocationTargetException e) {
					this.e.printStackTrace();
				}
			}
		}
	}

	public void tFileList_1_error(Exception exception) throws TalendException {
		end_Hash.put("tFileList_1", System.currentTimeMillis());
		tFileList_1_onSubJobError(exception);
	}

	public void tFileDelete_1_error(Exception exception) throws TalendException {
		end_Hash.put("tFileDelete_1", System.currentTimeMillis());
		tFileList_1_onSubJobError(exception);
	}

	public void tFileList_1_onSubJobError(Exception exception)
			throws TalendException {
	}

	public void tFileList_1Process() throws TalendException {
		try {

			/**
			 * [tFileList_1 begin ] start
			 */

			ok_Hash.put("tFileList_1", false);
			start_Hash.put("tFileList_1", System.currentTimeMillis());
			currentComponent = "tFileList_1";

			// tFileList_Begin

			String directory_tFileList_1 = ((String) context
					.getProperty("directory")).endsWith("/")
					|| ((String) context.getProperty("directory"))
							.endsWith("\\") ? context.directory.substring(0,
					((String) context.getProperty("directory")).length() - 1)
					: ((String) context.getProperty("directory"));
			String filemask_tFileList_1 = "*.csv" + "$";
			String excludefilemask_tFileList_1 = "*.txt" + "$";
			if (filemask_tFileList_1.indexOf("^") == -1)
				filemask_tFileList_1 = "^" + filemask_tFileList_1;

			if (excludefilemask_tFileList_1.indexOf("^") == -1)
				excludefilemask_tFileList_1 = "^" + excludefilemask_tFileList_1;

			filemask_tFileList_1 = java.util.regex.Pattern.compile("[*]")
					.matcher(filemask_tFileList_1).replaceAll(".*");
			excludefilemask_tFileList_1 = java.util.regex.Pattern
					.compile("[*]").matcher(excludefilemask_tFileList_1)
					.replaceAll(".*");

			boolean case_sensitive_tFileList_1 = true;
			java.util.regex.Pattern fileNamePattern_tFileList_1 = java.util.regex.Pattern
					.compile(filemask_tFileList_1);
			java.util.regex.Pattern excludefileNamePattern_tFileList_1 = java.util.regex.Pattern
					.compile(excludefilemask_tFileList_1);
			if (!case_sensitive_tFileList_1) {
				fileNamePattern_tFileList_1 = java.util.regex.Pattern.compile(
						filemask_tFileList_1,
						java.util.regex.Pattern.CASE_INSENSITIVE);
				excludefileNamePattern_tFileList_1 = java.util.regex.Pattern
						.compile(excludefilemask_tFileList_1,
								java.util.regex.Pattern.CASE_INSENSITIVE);
			}
			java.io.File file_tFileList_1 = new java.io.File(
					directory_tFileList_1);
			final java.util.List<java.io.File> list_tFileList_1 = new java.util.ArrayList<java.io.File>();
			file_tFileList_1.listFiles(new java.io.FilenameFilter() {
				public boolean accept(java.io.File dir, String name) {
					java.io.File file = new java.io.File(dir, name);
					if (!file.isDirectory()) {
						list_tFileList_1.add(file);
						return true;
					} else {
						file.listFiles(this);
					}
					return false;
				}
			});
			int NB_FILEtFileList_1 = 0;
			for (int i_tFileList_1 = 0; i_tFileList_1 < list_tFileList_1.size(); i_tFileList_1++) {

				java.io.File files_tFileList_1 = list_tFileList_1
						.get(i_tFileList_1);
				String fileName_tFileList_1 = files_tFileList_1.getName();

				if (!fileNamePattern_tFileList_1.matcher(fileName_tFileList_1)
						.find()
						|| excludefileNamePattern_tFileList_1.matcher(
								fileName_tFileList_1).find()) {
					continue;
				}

				String currentFileName_tFileList_1 = files_tFileList_1
						.getName();
				String currentFilePath_tFileList_1 = files_tFileList_1
						.getAbsolutePath();
				NB_FILEtFileList_1++;

				globalMap.put("tFileList_1_CURRENT_FILE",
						currentFileName_tFileList_1);
				globalMap.put("tFileList_1_CURRENT_FILEPATH",
						currentFilePath_tFileList_1);

				/**
				 * [tFileList_1 begin ] stop
				 */
				/**
				 * [tFileList_1 main ] start
				 */

				currentComponent = "tFileList_1";

				/**
				 * [tFileList_1 main ] stop
				 */
				/**
				 * [tFileDelete_1 begin ] start
				 */

				ok_Hash.put("tFileDelete_1", false);
				start_Hash.put("tFileDelete_1", System.currentTimeMillis());
				currentComponent = "tFileDelete_1";

				/**
				 * [tFileDelete_1 begin ] stop
				 */
				/**
				 * [tFileDelete_1 main ] start
				 */

				currentComponent = "tFileDelete_1";

				java.io.File file_tFileDelete_1 = new java.io.File(
						((String) globalMap.get("tFileList_1_CURRENT_FILEPATH")));
				if (file_tFileDelete_1.exists() && file_tFileDelete_1.isFile()) {
					file_tFileDelete_1.delete();
				} else {
					throw new RuntimeException(
							"File does not exists or is invalid");
				}

				/**
				 * [tFileDelete_1 main ] stop
				 */
				/**
				 * [tFileDelete_1 end ] start
				 */

				currentComponent = "tFileDelete_1";

				ok_Hash.put("tFileDelete_1", true);
				end_Hash.put("tFileDelete_1", System.currentTimeMillis());

				/**
				 * [tFileDelete_1 end ] stop
				 */

				/**
				 * [tFileList_1 end ] start
				 */

				currentComponent = "tFileList_1";

			}

			globalMap.put("tFileList_1_NB_FILE", NB_FILEtFileList_1);

			ok_Hash.put("tFileList_1", true);
			end_Hash.put("tFileList_1", System.currentTimeMillis());

			/**
			 * [tFileList_1 end ] stop
			 */

		} catch (Exception e) {

			throw new TalendException(this, e);
		}

	}

	public static boolean watch = false;
	public static int portStats = 3334;
	public static int portTraces = 4334;
	public static String clientHost;
	public static String defaultClientHost = "localhost";
	public static String contextStr = "Default";
	public static String pid = "0";
	public static String rootPid = null;
	public static String fatherPid = null;

	private static java.util.Properties context_param = new java.util.Properties();

	public static String status = "";

	public static void main(String[] args) {

		int exitCode = runJobInTOS(args);

		globalBuffer.clear();

		System.exit(exitCode);
	}

	public static String[][] runJob(String[] args) {

		int exitCode = runJobInTOS(args);
		String[][] bufferValue = new String[][] { { Integer.toString(exitCode) } };

		globalBuffer.clear();

		return bufferValue;
	}

	public static synchronized int runJobInTOS(String[] args) {

		init();

		String lastStr = "";
		for (String arg : args) {
			if (arg.equalsIgnoreCase("--context_param")) {
				lastStr = arg;
			} else if (lastStr.equals("")) {
				evalParam(arg);
			} else {
				evalParam(lastStr + " " + arg);
				lastStr = "";
			}
		}

		if (clientHost == null) {
			clientHost = defaultClientHost;
		}

		pid = TalendString.getAsciiRandomString(6);
		if (rootPid == null) {
			rootPid = pid;
		}
		if (fatherPid == null) {
			fatherPid = pid;
		}

		try {
			java.io.InputStream inContext = delete_all_root_and_subdir_files0_1.class
					.getClassLoader()
					.getResourceAsStream(
							"java_project_5/delete_all_root_and_subdir_files/contexts/Default.properties");
			if (inContext != null) {
				defaultProps.load(inContext);
				inContext.close();
				context = new ContextProperties(defaultProps);
			}

			if (contextStr.compareTo("Default") != 0) {
				inContext = delete_all_root_and_subdir_files0_1.class
						.getClassLoader().getResourceAsStream(
								"java_project_5/delete_all_root_and_subdir_files/contexts/"
										+ contextStr + ".properties");
				if (inContext != null) {
					context.load(inContext);
					inContext.close();
				}
			}

			if (!context_param.isEmpty()) {
				context.putAll(context_param);
			}

			context.directory = (String) context.getProperty("directory");

		} catch (java.io.IOException ie) {
			System.err.println("Could not load context " + contextStr);
			ie.printStackTrace();
		}

		long startUsedMemory = Runtime.getRuntime().totalMemory()
				- Runtime.getRuntime().freeMemory();
		long endUsedMemory = 0;
		long end = 0;
		long start = System.currentTimeMillis();
		final delete_all_root_and_subdir_files0_1 delete_all_root_and_subdir_filesClass = new delete_all_root_and_subdir_files0_1();
		try {
			errorCode = null;
			delete_all_root_and_subdir_filesClass.tFileList_1Process();
			status = "end";
		} catch (TalendException e_tFileList_1) {
			status = "failure";
			e_tFileList_1.printStackTrace();

		} finally {
		}
		end = System.currentTimeMillis();
		if (watch) {
			System.out.println((end - start) + " milliseconds");
		}

		endUsedMemory = Runtime.getRuntime().totalMemory()
				- Runtime.getRuntime().freeMemory();
		if (false) {
			System.out
					.println((endUsedMemory - startUsedMemory)
							+ " bytes memory increase when running : delete_all_root_and_subdir_files");
		}

		reset();

		if (errorCode == null) {
			return status != null && status.equals("failure") ? 1 : 0;
		} else {
			return errorCode.intValue();
		}
	}

	public static void evalParam(String arg) {
		if (arg.startsWith("--watch")) {
			watch = true;
		} else if (arg.startsWith("--stat_port=")) {
			portStats = Integer.parseInt(arg.substring(12));
		} else if (arg.startsWith("--trace_port=")) {
			portTraces = Integer.parseInt(arg.substring(13));
		} else if (arg.startsWith("--client_host=")) {
			clientHost = arg.substring(14);
		} else if (arg.startsWith("--context=")) {
			contextStr = arg.substring(10);
		} else if (arg.startsWith("--father_pid=")) {
			fatherPid = arg.substring(13);
		} else if (arg.startsWith("--root_pid=")) {
			rootPid = arg.substring(11);
		} else if (arg.startsWith("--context_param")) {
			String keyValue = arg.substring(16);
			int index = -1;
			if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
				context_param.put(keyValue.substring(0, index), keyValue
						.substring(index + 1));
			}
		}

	}

	private static void init() {
		errorCode = null;
		status = "";
	}

	private static void reset() {

		defaultProps.clear();
		context.clear();
		currentComponent = "";
		start_Hash.clear();
		end_Hash.clear();
		ok_Hash.clear();
		globalMap.clear();
		watch = false;
		portStats = 3334;
		portTraces = 4334;
		clientHost = null;
		defaultClientHost = "localhost";
		contextStr = "Default";
		pid = "0";
		rootPid = null;
		fatherPid = null;
		context_param.clear();
		System.gc();
	}
}
/*******************************************************************************
 * 14121 characters generated by Talend OpenStudio on the 20 mars 2008 13:43:18
 * CET
 ******************************************************************************/
