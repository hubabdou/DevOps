import type { Metadata } from "next";
//import { Inter } from "next/font/google";
import "@/app/ui/globals.css";
//import { headers } from 'next/headers';
//import { headers } from 'next/dist/client/components/headers';
//const inter = Inter({ subsets: ["latin"] });
import { Providers } from '@/app/lib/nextui';
import {
  Navbar,
  NavbarContent 
} from "@/app/lib/nextui";
import NavLinks from '@/app/ui/nav-links';
import NavButtons from '@/app/ui/nav-buttons';
import UserSessionProvider from '@/app/user-provider';
import ThemeProvider from '@/app/theme-provider';
import ThemeSwitch from '@/app/ui/theme-switch';

export const metadata: Metadata = {
  title: {
    template: "%s | NextJs Book App",
    default: "Home Page | NextJs Book App"
  },
  description: "Generated by create next app",
};

export default function RootLayout({
  children,
  params
}: Readonly<{
  children: React.ReactNode;
}>) {
  //const headersList = headers();
  //console.log(headersList.get("x-url"));
  //const router = useRouter();
  //const pathname = headersList.get("x-invoke-path") || "";
  return (
    <html lang="en" suppressHydrationWarning>
        <body className='bg-neutral-150'>
          <ThemeProvider>
            <Providers>
              <UserSessionProvider>
                <Navbar isBordered className="mb-6 bg-transparent">
                  <NavbarContent className="hidden sm:flex gap-4" justify="center">
                    <NavLinks />
                  </NavbarContent>
                  <NavbarContent justify="end">
                    <ThemeSwitch />
                    <NavButtons />
                  </NavbarContent>
                </Navbar>
                {children}
              </UserSessionProvider>  
            </Providers>
          </ThemeProvider>
        </body>
      </html>
  );
}
